package com.example.gaurav.material;

import java.util.ArrayList;

/**
 * Created by Gaurav on 13-06-2016.
 */
public class Landscape {

    private int imageId;
    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ArrayList<Landscape> getData(){
        ArrayList<Landscape> dataList = new ArrayList<>();
        int[] images = getImages();
        for (int i =0;i<images.length;i++){
            Landscape landscape = new Landscape();
            landscape.setImageId(images[i]);
            landscape.setTitle("Landscape" +i );
            dataList.add(landscape);

        }
        return dataList;
    }

    public static int[] getImages(){
        int[] images = new int[]{
             R.drawable.new_11,R.drawable.new12,
                R.drawable.new_13, R.drawable.new_14,
                R.drawable.new_15, R.drawable.new_16,
                R.drawable.new_17, R.drawable.new_18,
                R.drawable.new_19, R.drawable.new_20


        };
        return images;
    }


}
