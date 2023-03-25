package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation <= 9) {
            currentStation = newCurrentStation;
        }

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNextStation() {
        int station = getCurrentStation();
        if (station < 9) {
            station++;
            setCurrentStation(station);

        } else {
            setCurrentStation(0);
        }
    }


    public void setPrevStation() {
        int station = getCurrentStation();
        if (station > 0) {
            station--;
            setCurrentStation(station);
        } else {
            setCurrentStation(9);
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
