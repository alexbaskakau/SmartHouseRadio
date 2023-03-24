package ru.netology;
public class Radio {
    public int currentStation;
    public int currentVolume;

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation <= 9) {
            currentStation = newCurrentStation;
        }

    }
    public int getCurrentStation() {
        return currentStation;
    }

    public void setNextStation() {

        if (currentStation <9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
        }



    public void setPrevStation() {
        if (currentStation > 0) {
            currentStation--;

        } else {
            currentStation = 9;
        }


    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int newVolume) {
        if (newVolume > 100) {
            newVolume = 100;
        }
            if (newVolume < 0) {
                newVolume = 0;
            }
            currentVolume = newVolume;
        }



    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume -1;
        }
    }
}
