package ru.netology;

public class Radio {
    private int firstStation = 0;
    private int lastStation = 9;
    private int currentStation;
    private int currentVolume;

    public Radio(int number) {
        this.lastStation = number - 1;
        this.firstStation = 0;
        this.currentStation = getCurrentStation();
    }

    public Radio() {
        this.firstStation = getFirstStation();
        this.lastStation = getLastStation();
        this.currentStation = getCurrentStation();
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation <= getLastStation()) {
            currentStation = newCurrentStation;
        } else {
            currentStation = firstStation;
        }
    }

    public int getFirstStation() {

        return firstStation;
    }

    public int getLastStation() {

        return lastStation;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        int station = getCurrentStation();
        // if (station <= getLastStation()) {
        setCurrentStation(station + 1);
        //}

    }


    public void prevStation() {
        int station = getCurrentStation();
        if (station > getFirstStation()) {
            station--;
            setCurrentStation(station);
        } else {
            setCurrentStation(getLastStation());
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
        int volume = getCurrentVolume();
        if (volume < 100) {
            volume++;
            setCurrentVolume(volume);
        }
    }

    public void decreaseVolume() {
        int volume = getCurrentVolume();
        if (volume > 0) {
            volume--;
            setCurrentVolume(volume);
        }
    }
}
