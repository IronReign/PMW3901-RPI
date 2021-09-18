public class SC18IS602B {
    enum SC18IS602B_SPI_Speed {
        SC18IS602B_SPICLK_1843_kHz(0B00), // 1.8 Mbit/s
        SC18IS602B_SPICLK_461_kHz(0B01),  // 461 kbit/s
        SC18IS602B_SPICLK_115_kHz(0B10),  // 115 kbit/s
        SC18IS602B_SPICLK_58_kHz(0B11);   // 58 kbit/s

        private final int speed;

        private SC18IS602B_SPI_Speed(int speed) {
            this.speed = speed;
        }
    }

    enum SC18IS602B_SPI_Mode {
        SC18IS602B_SPIMODE_0(0B00), // CPOL: 0  CPHA: 0
        SC18IS602B_SPIMODE_1(0B01), // CPOL: 0  CPHA: 1
        SC18IS602B_SPIMODE_2(0B10), // CPOL: 1  CPHA: 0
        SC18IS602B_SPIMODE_3(0B11); // CPOL: 1  CPHA: 1

        private final int mode;

        private SC18IS602B_SPI_Mode(int mode) {
            this.mode = mode;
        }
    }
}
