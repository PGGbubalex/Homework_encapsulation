public class flower {

    private String name;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost > 0) {
            double roundOff = Math.round(cost * 100.0 / 100.0);
            this.cost = roundOff;
        } else {
            this.cost = 1;
        }
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost > 0) {
            double roundOff = Math.round(cost * 100.0 / 100.0);
            this.cost = roundOff;
        } else {
            this.cost = 1;
        }
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public void flowerInfo() {
        System.out.println(this.name + ", цвет: " + this.flowerColor + ", страна: " + this.country + ", цена: " + this.cost + ", срок состояния в днях: " + this.lifeSpan + ".");
    }
}
