package org.example;

import org.json.JSONArray;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Point p = new Point();
        Figure f = new Figure();
        JSONArray array = new JSONArray();
        Point p2 = p;
        Figure f2 = f;

        Point p3 = p;
        Figure f3 = f;

        System.out.println("Simple Maven App");
    }
}
