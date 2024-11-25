package com.javarush.telegram;

public class UserInfo {
    public String name; //Ім'я
    public String sex; //Стать
    public String age; //Вік
    public String city; //Місто
    public String occupation; //Професія
    public String hobby; //Хобі
    public String handsome; //Краса, привабливість
    public String wealth; //Дохід, багатство
    public String annoys; //Мене дратує у людях
    public String goals; //Цілі знайомства

    private String fieldToString(String str, String description) {
        if (str != null && !str.isEmpty())
            return description + ": " + str + "\n";
        else
            return "";
    }

    @Override
    public String toString() {
        String result = "";

        result += fieldToString(name, "Ім'я");
        result += fieldToString(sex, "Стать");
        result += fieldToString(age, "Вік");
        result += fieldToString(city, "Місто");
        result += fieldToString(occupation, "Професія");
        result += fieldToString(hobby, "Хобі");
        result += fieldToString(handsome, "Краса, привабливість у балах (максимум 10 балів)");
        result += fieldToString(wealth, "Доход, богатство");
        result += fieldToString(annoys, "В людях дратує");
        result += fieldToString(goals, "Цілі знайомства");

        return result;
    }
}
