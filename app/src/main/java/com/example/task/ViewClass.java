package com.example.task;

public class ViewClass {
    private String name;
    private String weekOff;

    public ViewClass(String name, String weekOff) {
        this.name = name;
        this.weekOff = weekOff;
    }

    public String getNameText() {
        return name;
    }

    public String getWeekOffText() {
        return weekOff;
    }

//    public ProfileClass() {
//
//    }
//
//    public List<Map<String, String>> weekOffList() {
//        String names[] = {"Akshit", "Aman", "Abhishek", "Vamsi", "Rooha", "Vinayak", "Harshit", "Anshul"};
//        String weekOff[] = {"24-31 Jan", "Today-30Jan", "01 Feb", "02-05 Feb", "Yestarday", "14 Jan", "30 Dec", "28 Dec"};
//
//        List<Map<String, String>> dataList = new ArrayList<>();
//
//        for (int i = 0; i < names.length; i++) {
//            Map<String, String> map = new HashMap<>();
//            map.put("Name", names[i]);
//            map.put("Days", weekOff[i]);
//            dataList.add(map);
//        }
//
//        return dataList;
//    }
//
//    public List<Map<String, String>> wishThemList() {
//        String names[] = {"Akshit", "Aman", "Abhishek", "Vamsi", "Rooha", "Vinayak", "Harshit", "Anshul"};
//        String birth[] ={"1 March", "30 Jan", "30 Dec", "28 Dec", "01 Feb", "05 March", "26 Jan", "1 Feb"};
//
//        List<Map<String, String>> dataList = new ArrayList<>();
//
//        for (int i = 0; i < names.length; i++) {
//            Map<String, String> map = new HashMap<>();
//            map.put("Name", names[i]);
//            map.put("Days", birth[i]);
//            dataList.add(map);
//        }
//
//        return dataList;
//    }
//
//    public List<Map<String, String>> holidayList() {
//        String holidays [] = {"Maha Shivaratri", "Holi", "Good Friday", "Ugadi", "Eid AI Fitr", "Ram Navami","Bakrid/Eid al Adha",
//                "Independence Day", "Rakshabandhan", "Krishna Jayanti/Janmashtmi"};
//        String dates[] = {"Fri, 08 March 2024", "Mon, 25 March 2024", "Fri, 29 March 2024", "Tue, 09 April 2024", "Wed, 10 April 2024", "Wed, 17 April 2024", "Mon, 17 June 2024",
//                "Thu, 15 August 2024", "Mon, 19 August 2024", "Mon, 26 August 2024"};
//
//        List<Map<String, String>> dataList = new ArrayList<>();
//
//        for (int i = 0; i < holidays.length; i++) {
//            Map<String, String> map = new HashMap<>();
//            map.put("Name", holidays[i]);
//            map.put("birth", dates[i]);
//            dataList.add(map);
//        }
//
//        return dataList;
//    }
}
