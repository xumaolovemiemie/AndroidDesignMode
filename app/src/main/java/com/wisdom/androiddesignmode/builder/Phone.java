package com.wisdom.androiddesignmode.builder;

public class Phone {
    private String cpu;
    private String camera;
    private String screen;
    private String battery;

    public Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.camera = builder.camera;
        this.screen = builder.screen;
        this.battery = builder.battery;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public static class Builder {
        private String cpu;
        private String camera;
        private String screen;
        private String battery;

        public Builder() {

        }

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setCamera(String camera) {
            this.camera = camera;
            return this;
        }

        public Builder setScreen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder setBattery(String battery) {
            this.battery = battery;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }
}
