package com.chartboost.sdk.Libraries;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class a {
    public static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a(inputStream, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        return a(inputStream, outputStream, (int) Constants.BUFFER_SIZE);
    }

    public static int a(InputStream inputStream, OutputStream outputStream) throws IOException {
        long b10 = b(inputStream, outputStream);
        if (b10 > 2147483647L) {
            return -1;
        }
        return (int) b10;
    }

    public static long a(InputStream inputStream, OutputStream outputStream, int i10) throws IOException {
        return a(inputStream, outputStream, new byte[i10]);
    }

    public static long a(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        long j10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j10;
            }
            outputStream.write(bArr, 0, read);
            j10 += read;
        }
    }
}
