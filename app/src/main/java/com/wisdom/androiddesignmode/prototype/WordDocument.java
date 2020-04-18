package com.wisdom.androiddesignmode.prototype;

import java.util.ArrayList;

/**
 * @author xumao
 */
public class WordDocument implements Cloneable {

    private String text;
    private ArrayList<String> imgs = new ArrayList<>();

    public WordDocument() {
        System.out.println("----------构造函数----------");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.text = this.text;
            //1.浅拷贝
            doc.imgs = this.imgs;

            //2.深拷贝--对imgs对象也调用clone()函数，进行深拷贝
            doc.imgs = (ArrayList<String>) this.imgs.clone();
            return doc;
        } catch (Exception ignored) {
        }
        return null;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getImgs() {
        return imgs;
    }

    public void setImgs(ArrayList<String> imgs) {
        this.imgs = imgs;
    }
}
