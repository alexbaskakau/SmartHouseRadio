import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {
   Radio station = new Radio(160);
   @Test
   public void shouldNotSetStationOverLimit() {
       station.setCurrentStation(178);
       int expected = 0;
       int actual = station.getCurrentStation();
       Assertions.assertEquals(expected, actual);

   }
   @Test
   public void shouldNotSetNextStationOverLimit() {
      station.setCurrentStation(159);
      station.nextStation();
      int actual = station.getCurrentStation();
      int expected = 0;
      Assertions.assertEquals(expected , actual);
   }
   @Test
   public void shouldNotSetPrevStationUnderLimit() {
       station.setCurrentStation(0);
       station.prevStation();
       int actual = station.getCurrentStation();
       int expected = 159;
       Assertions.assertEquals(expected , actual);

   }
   @Test
   public void shouldSetNextStation() {
       station.setCurrentStation(98);
       station.nextStation();
       int actual = station.getCurrentStation();
       int expected = 99;
       Assertions.assertEquals(expected , actual);
   }
   @Test
   public  void shouldSetPrevStation() {
      station.setCurrentStation(69);
      station.prevStation();
      int actual = station.getCurrentStation();
      int expected = 68;
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
