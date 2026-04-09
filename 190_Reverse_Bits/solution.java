public class solution {

    public int reverseBits(int n) {
        int result = 0;

        for (int bitposition = 0; bitposition < 32 && n != 0; bitposition++) {
            int currentBit = n & 1;

            result |= currentBit << (31 - bitposition);

            n >>>= 1;
        }
        return result;
    }
}