package decorator;

import java.io.*;

public class LowercaseInputStream extends FilterInputStream {
    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    protected LowercaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {

        int result = super.read(b, offset, len);
        for (int i = offset; i < result + offset; i++) {
            if (b[i] != -1) {
                Character.toLowerCase((char) b[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int c;

        try {
            InputStream in = new LowercaseInputStream(new BufferedInputStream(new FileInputStream("/Users/yuliiadovbak/IdeaProjects/DesignPatterns/src/decorator/test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print( (char)c );
            }
            in.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
