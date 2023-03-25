import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio station = new Radio();
        station.setCurrentStation(2);
        int expected = 2;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetStationOverLimit() {
        Radio station = new Radio();
        station.setCurrentStation(25);
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNextStation() {
        Radio station = new Radio();
        station.setCurrentStation(5);
        station.setNextStation();
        int expected = 6;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationToBeginning() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.setNextStation();
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevStation() {
        Radio station = new Radio();
        station.setCurrentStation(7);
        station.setPrevStation();
        int expected = 6;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationToEnd() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.setPrevStation();
        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(67);
        volume.increaseVolume();
        int expected = 68;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeOverLimit() {
        Radio volume = new Radio();
        volume.setCurrentVolume(120);
        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(9);
        volume.decreaseVolume();
        int expected = 8;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeUnderLimit() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-2);
        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
