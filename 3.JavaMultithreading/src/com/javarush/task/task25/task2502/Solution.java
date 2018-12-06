package com.javarush.task.task25.task2502;

import java.util.ArrayList;
import java.util.List;

/* 
Машину на СТО не повезем!
*/
public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() throws Exception {
            wheels = new ArrayList<>();
            String[] str = loadWheelNamesFromDB();
            for (String s : str) {
                switch (Wheel.valueOf(s)) {
                    case BACK_LEFT:
                        wheels.add(Wheel.BACK_LEFT);
                        break;
                    case BACK_RIGHT:
                        wheels.add(Wheel.BACK_RIGHT);
                        break;
                    case FRONT_LEFT:
                        wheels.add(Wheel.FRONT_LEFT);
                        break;
                    case FRONT_RIGHT:
                        wheels.add(Wheel.FRONT_RIGHT);
                        break;
                    default:
                        wheels.add(null);
                }
            }
            if (wheels.size() != 4) {
                throw new Exception();
            }
        }

        protected String[] loadWheelNamesFromDB() throws Exception {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
    }
}
