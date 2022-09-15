package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String text, PoemDecorator poemDecorator){
        String beautifyText = poemDecorator.decorate(text);
        System.out.println(beautifyText);
    }

    public static String addABC(String text){
        return "ABC-- " + text + " --ABC";
    }
    public static String upperCase(String text) {
        return  text.toUpperCase();
    }
    public static String trim(String text) {
        return text.trim();
    }
    public static String lowerCase(String text) {
        return text.toLowerCase();
    }

}
