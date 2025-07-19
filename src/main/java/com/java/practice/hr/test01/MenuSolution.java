package com.java.practice.hr.test01;

import java.util.*;
import java.io.*;

/**
 * This class implements a menu recommendation system that allows adding items,
 * rating them, marking them as out of stock, and designating a deal of the day.
 * 1. Java: Menu Recommendation
 * Design a menu recommendation system for a restaurant. It suggests an item that one might want to try from a restaurant.
 * The recommendation is made using the following logic:
 * • If the head chef decides to offer a dish as "the deal of the day", it is recommended.
 * • If there is no "deal of the day" item, the item with the highest average rating is recommended.
 * • If there is a "deal of the day" item, but it is out of stock, the in-stock item with the highest average rating is recommended.
 * • If there are items with identical average ratings, the following criteria should be considered while recommending the items:
 * • Number of Ratings: Recommend the item with a higher number of ratings.
 * • Item ID: In case of a continued tie, recommend the item with the higher item ID.
 * Note:
 * • If an item goes out of stock, it will no longer retain its "deal of the day" status, if any, even if it's restocked later.
 * • It is guaranteed that each item ID is unique.
 * The average rating of an item is calculated as: (sum of ratings for an item) / (total number of people who have rated this item).
 * Complete the class MenuRecommendation that implements
 * void addltem(int itemld, String displayName): Create and store a Menultem object from the given information. The definition of class Menultem is given in the code stub.
 * • Menultem getRecommendedltem: Return the recommended Menultem. If there is no such Menultem, return null.
 * • void outOfStockltem(int itemld): Mark itemld as out of stock.
 * • void restockltem(int itemld): Mark itemld as back in stock.
 * • void makeDealOfTheDay/tem(int itemld): Mark itemld as the deal of the day and the recommended item.
 * • void rateltem(int itemld, int rating): A user rated the item with itemld as rating number of points.
 * The driver code takes care of input and calls the relevant functions. There are totalNumberOfRequests, and each of the next lines is a request that is one of 6 types of function call.
 * Constraints
 * • 1 ≤ totalNumberOfRequests ≤ 105
 * • 1 sitemld ≤ 105
 * • 1 ≤ rating ≤ 5
 * • 1 ≤ | displayName / ≤ 10
 * Input Format For Custom Testing
 * The first line contains an integer,
 * totalNumberOfRequests, the number of requests.
 * Each i of the next totalNumberOfRequests contains a request described above.
 * • Sample Case 0
 * Sample Input For Custom Testing
 * 8
 * getRecommendedItem addItem 1 Item rateItem 1 5
 * getRecommendedItem outOfStockItem 1
 * rateltem 1 4
 * rateltem 1 4
 * getRecommendedItem
 * Sample Output
 * N/ A
 * N/ A
 * 1 Item Rating: 5.0
 * Explanation
 * • getRecommendedltem - there are no item entries so this outputs 'N/A
 * • addltem 1 Item - Adds Item 1 with itemld 1.
 * • rateltem 1 5 - Adds a rating of 5 to Item.
 * • getRecommendedItem - there is only 1 item added yet with 1 rating of 5.
 * • outOfStock/tem 1 - marks /tem1 as out of stock
 * • rateltem 1 4 - Adds a rating of 4 to Item 1.
 * • rateltem 1 4 -Adds a rating of 4 to Item.
 * • getRecommendedltem - There are no items in stock to recommend.
 */
class MenuItem {
    int itemId;
    String displayName;
    long sumOfRating;
    int numberOfPeopleWhoRatedIt;
}

interface IMenuRecommendation {
    void addItem(int id, String displayName);
    MenuItem getRecommendedItem();
    void outOfStockItem(int itemId);
    void restockItem(int itemId);
    void makeDealOfTheDayItem(int itemId);
    void rateItem(int itemId, int rating);
}


class MenuRecommendation implements IMenuRecommendation {

    private final Map<Integer, MenuItem> items = new HashMap<>();
    private final Set<Integer> outOfStockItems = new HashSet<>();
    private final Set<Integer> invalidatedDeals = new HashSet<>();
    private Integer dealOfTheDayId = null;

    @Override
    public void addItem(int id, String displayName) {
        if (!items.containsKey(id)) {
            MenuItem item = new MenuItem();
            item.itemId = id;
            item.displayName = displayName;
            item.sumOfRating = 0;
            item.numberOfPeopleWhoRatedIt = 0;
            items.put(id, item);
        }
    }

    @Override
    public MenuItem getRecommendedItem() {
        if (dealOfTheDayId != null && !outOfStockItems.contains(dealOfTheDayId)) {
            return items.get(dealOfTheDayId);
        }


        MenuItem best = null;
        for (MenuItem item : items.values()) {
            if (outOfStockItems.contains(item.itemId)) continue;

            if (best == null
                    || getAvg(item) > getAvg(best)
                    || (getAvg(item) == getAvg(best)
                    && (item.numberOfPeopleWhoRatedIt > best.numberOfPeopleWhoRatedIt
                    || (item.numberOfPeopleWhoRatedIt == best.numberOfPeopleWhoRatedIt
                    && item.itemId > best.itemId)))) {
                best = item;
            }
        }

        return best;
    }

    @Override
    public void outOfStockItem(int itemId) {
        outOfStockItems.add(itemId);
        if (dealOfTheDayId != null && dealOfTheDayId == itemId) {
            invalidatedDeals.add(itemId); // once out of stock, deal is lost forever
            dealOfTheDayId = null;
        }
    }

    @Override
    public void makeDealOfTheDayItem(int itemId) {
        if (items.containsKey(itemId)
                && !outOfStockItems.contains(itemId)
                && !invalidatedDeals.contains(itemId)) {
            dealOfTheDayId = itemId;
        }
    }

    @Override
    public void rateItem(int itemId, int rating) {
        MenuItem item = items.get(itemId);
        if (item != null) {
            item.sumOfRating += rating;
            item.numberOfPeopleWhoRatedIt++;
        }
    }

    @Override
    public void restockItem(int itemId) {
        outOfStockItems.remove(itemId);
    }

    private double getAvg(MenuItem item) {
        if (item.numberOfPeopleWhoRatedIt == 0) return 0.0;
        return (double) item.sumOfRating / item.numberOfPeopleWhoRatedIt;
    }
}
public class MenuSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int totalNumberOfRequests = Integer.parseInt(br.readLine().trim());

        String arr[];

        IMenuRecommendation menuRecommendation = new MenuRecommendation();

        for(int requestNumber = 1; requestNumber <= totalNumberOfRequests; requestNumber++) {
            arr = br.readLine().trim().split(" ");
            switch(arr[0]) {
                case "addItem":
                    int id = Integer.parseInt(arr[1]);
                    String displayName = arr[2];
                    menuRecommendation.addItem(id, displayName);
                    break;
                case "getRecommendedItem":
                    MenuItem menuItem = menuRecommendation.getRecommendedItem();
                    if(menuItem == null) {
                        out.println("N/A");
                        break;
                    }
                    double averageRating = (menuItem.numberOfPeopleWhoRatedIt == 0) ?
                            0 :
                            (menuItem.sumOfRating / (menuItem.numberOfPeopleWhoRatedIt * 1.0d));
                    out.println(menuItem.itemId + " " + menuItem.displayName + " Rating: " + averageRating) ;
                    break;
                case "outOfStockItem":
                    int itemId = Integer.parseInt(arr[1]);
                    menuRecommendation.outOfStockItem(itemId);
                    break;
                case "restockItem":
                    itemId = Integer.parseInt(arr[1]);
                    menuRecommendation.restockItem(itemId);
                    break;
                case "makeDealOfTheDayItem":
                    itemId = Integer.parseInt(arr[1]);
                    menuRecommendation.makeDealOfTheDayItem(itemId);
                    break;
                case "rateItem":
                    itemId = Integer.parseInt(arr[1]);
                    int rating = Integer.parseInt(arr[2]);
                    menuRecommendation.rateItem(itemId, rating);
                    break;
            }
        }

        out.flush();
        out.close();
    }
}