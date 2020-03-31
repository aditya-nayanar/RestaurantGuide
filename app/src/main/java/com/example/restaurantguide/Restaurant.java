package com.example.restaurantguide;

import android.widget.ImageView;

import java.util.ArrayList;

//Class containing the list of restaurants
public class Restaurant {

    private String name;
    private String cuisine;
    private String location;
    private double rating;
    private String description;
    private String map;
    private String website;
    private int logo;

    public Restaurant(String name, String cuisine, String location, double rating, String description, String map, String website, int logo) {
        this.name = name;
        this.cuisine = cuisine;
        this.location = location;
        this.rating = rating;
        this.description = description;
        this.map = map;
        this.website = website;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    //Method to et required methods and includes all links and description information
    public static ArrayList<Restaurant> getRestaurants(){
        ArrayList<Restaurant> list = new ArrayList<>();

        String barLucaMap = "https://www.google.com/maps/place/Bar+Luca/@-33.863968,151.2097453,17z/data=!3m1!4b1!4m5!3m4!1s0x6b12ae698b9b065" +
                "5:0xafcd3306ae42d058!8m2!3d-33.863968!4d151.211934";
        String barLucaWebsite = "https://barluca.com.au/";
        String barLucaD = "A vibrant burger joint, serving a variety of interesting creations and burgers overflowing with quality ingredients. Don't forget to grab a drink " +
                "with a wide selection available.";

        String gamiMap = "https://www.google.com.au/maps/place/Gami+Chicken+%26+Beer/@-33.7166566,150.755749,11z/data=!4m8!1m2!2m1!1sgami+chic" +
                "ken+%26+beer!3m4!1s0x6b12a1b3cb221b7f:0xfcf9d8f898e161d3!8m2!3d-33.7323804!4d151.0046095?hl=en-GB&authuser=0";
        String gamiWebsite = "https://gamichicken.com.au/";
        String gamiD = "A great place to enjoy the perfect combination of Korean Fried Chicken and beer with a group of friends. With a simple menu, it won't take you long " +
                "to order and get the food out to eat.";

        String timeMap = "https://www.google.com.au/maps/place/It's+Time+For+Thai/@-33.9222177,151.224478,17z/data=!3m1!4b1!4m5!3m4!1s0x6b12b1" +
                "8f24355e0f:0x91b7dbc927c62faa!8m2!3d-33.9222222!4d151.2266667?hl=en-GB&authuser=0";
        String timeWebsite = "https://timeforthai.com.au/";
        String timeD = "A popular establishment frequented by university students from nearby UNSW, enjoy lunch specials or an excellent menu that explores the variety " +
                "Thai cuisine has to offer.";

        String cargoMap = "https://www.google.com.au/maps/place/Cargo+Bar/@-33.7938201,150.975881,12z/data=!4m5!3m4!1s0x6b12ae4776f7155f:0x2f" +
                "517439214a7f2b!8m2!3d-33.8687158!4d151.2018488?hl=en-GB&authuser=0";
        String cargoWebsite = "https://cargobar.com.au/";
        String cargoD = "Whether it's a work lunch or a night out in Darling Harbour, Cargo Bar is a great setting to grab the staples of casual dining. ";

        String wildMap = "https://www.google.com.au/maps/place/Wild+Pear+Cafe/@-33.6775544,151.0239954,17z/data=!3m1!4b1!4m5!3m4!1s0x6b0d5f5f" +
                "ee7c5155:0x66a31b3490e4700!8m2!3d-33.6775589!4d151.0261841?hl=en-GB&authuser=0";
        String wildWebsite = "https://www.wildpearcafe.com/";
        String wildD = "Restaurant and Bar, Wild Pear Cafe has a great creative selection to explore any chance you get. Located away in The Hills District of Syndey, it's " +
                "a great chance to escape the busiest areas of the Sydney.";

        String milkyMap = "https://www.google.com.au/maps/place/Milky+Lane+Parramatta/@-33.8146351,150.9999822,17z/data=!3m1!4b1!4m5!3m4!1s0x6" +
                "b12a31f957d9633:0x5f8e5b331903006!8m2!3d-33.8146396!4d151.0021709?hl=en-GB&authuser=0";
        String milkyWebsite = "https://milkylane.co/";
        String milkyD = "Everything about a burger place but made just a little bit extra with wicked burger recipes and adventurous desserts. But be sure to plan ahead " +
                "because it can get filled up very quickly.";

        String uncleMap = "https://www.google.com.au/maps/place/Uncle+Mings/@-33.8670411,151.2034454,17z/data=!3m1!4b1!4m5!3m4!1s0x6b12ae40a2d7" +
                "2a91:0xe2385bfceb1714b4!8m2!3d-33.8670411!4d151.2056341?hl=en-GB&authuser=0";
        String uncleWebsite = "https://www.unclemings.com.au/";
        String uncleD = "Secretive, Hidden and Unique are just some of the words that describe such an amazing bar scene in the heart of Syndey. With a selection of creative " +
                "cocktails to pair with some dumplings, you will have a great late night out.";

        String benMap = "https://www.google.com.au/maps/place/Bennelong+Restaurant+and+Bar/@-33.85756,151.2124993,17z/data=!3m2!4b1!5s0x6b12ae668bea1245:0x1f2272a611269082!" +
                "4m5!3m4!1s0x6b12ae66608dc941:0x1c5249021cf980f3!8m2!3d-33.85756!4d151.214688?hl=en-GB&authuser=0";
        String benWebsite = "https://www.bennelong.com.au/";
        String benD = "Combining the scenery of arguably Sydney City's top attraction and exquisite fine dining, here is your destination for that special night or to " +
                "celebrate a special occasion. ";

        String sushiMap = "https://www.google.com/maps/place/Sushi+Rio/@-33.8759429,151.2021737,17z/data=!3m1!4b1!4m5!3m4!1s0x6b12ae3b62f7b79f:" +
                "0xd93d473dfad8cbb8!8m2!3d-33.8759429!4d151.2043624";
        String sushiWebsite = "http://www.sushiriosydney.com/";
        String sushiD = "The first thing many people associate with Japanese food is Sushi and how can you not say the same after visiting Sushi Rio. " +
                "With a good selection and professionally crafted sushi, you'll have a great time trying all sorts of flavours.";

        String chatMap = "https://www.google.com.au/maps/place/Chatkazz+Bella+Vista/@-33.7342892,150.9436389,17z/data=!3m1!4b1!4m5!3m4!1s0x6b12" +
                "9f517061e7f9:0xf860c02a89a743b5!8m2!3d-33.7342892!4d150.9458276?hl=en-GB&authuser=0";
        String chatWebsite = "https://www.chatkazz.com/";
        String chatD = "Adding to an already multicultural scene in sydney is great Indian place situated in Bella Vista with a parent store close by. Don't be fooled " +
                "by the all vegetarian menu meat lovers because Chatkazz know how to bring the best out of the ingredients they use.";

        list.add(new Restaurant("Bar Luca", "American", "Martin Place", 4.4, barLucaD, barLucaMap, barLucaWebsite, R.drawable.barlucaimage));
        list.add(new Restaurant("Gami Chicken & Beer", "Korean", "Castle Hill", 4.1, gamiD, gamiMap, gamiWebsite, R.drawable.gamiimage));
        list.add(new Restaurant("Time for thai", "Thai", "Kingsford", 3.8, timeD, timeMap, timeWebsite, R.drawable.timeimage));
        list.add(new Restaurant("Cargo Bar", "Australian", "Darling Harbour", 4.0, cargoD, cargoMap, cargoWebsite, R.drawable.cargoimage));
        list.add(new Restaurant("Wild Pear Cafe", "Australian", "Dural", 4.8, wildD, wildMap, wildWebsite, R.drawable.wild));
        list.add(new Restaurant("Milky Lane", "American", "Parramatta", 3.5, milkyD, milkyMap, milkyWebsite, R.drawable.milkyimage));
        list.add(new Restaurant("Uncle Ming's", "Chinese", "Sydney CBD", 3.6, uncleD, uncleMap, uncleWebsite, R.drawable.uncleimage));
        list.add(new Restaurant("Bennelong", "Australian", "Circular Quay", 4.2, benD, benMap, benWebsite, R.drawable.benimage));
        list.add(new Restaurant("Sushi Rio", "Japanese", "Sydney CBD", 4.0, sushiD, sushiMap, sushiWebsite, R.drawable.sushiimage));
        list.add(new Restaurant("Chatkazz", "Indian", "Bella Vista", 4.9, chatD, chatMap, chatWebsite, R.drawable.chatimage));
        return list;
    }
}
