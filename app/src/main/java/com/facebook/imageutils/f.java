package com.facebook.imageutils;

import android.util.Pair;
import com.inmobi.media.fq;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: WebpUtil.java */
/* loaded from: classes.dex */
public class f {
    private static boolean a(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (str.charAt(i10) != bArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int b(InputStream inputStream) throws IOException {
        return ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
    }

    private static byte c(InputStream inputStream) throws IOException {
        return (byte) (inputStream.read() & 255);
    }

    private static String d(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append((char) b10);
        }
        return sb2.toString();
    }

    private static int e(InputStream inputStream) throws IOException {
        return ((((byte) inputStream.read()) << 24) & (-16777216)) | ((((byte) inputStream.read()) << 16) & 16711680) | ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
    }

    private static short f(InputStream inputStream) throws IOException {
        return (short) (inputStream.read() & 255);
    }

    public static Pair<Integer, Integer> g(InputStream inputStream) {
        byte[] bArr = new byte[4];
        try {
            try {
                try {
                    inputStream.read(bArr);
                } catch (IOException e10) {
                    e10.printStackTrace();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            if (!a(bArr, "RIFF")) {
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
                return null;
            }
            e(inputStream);
            inputStream.read(bArr);
            if (!a(bArr, "WEBP")) {
                try {
                    inputStream.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
                return null;
            }
            inputStream.read(bArr);
            String d10 = d(bArr);
            if ("VP8 ".equals(d10)) {
                Pair<Integer, Integer> h10 = h(inputStream);
                try {
                    inputStream.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
                return h10;
            } else if ("VP8L".equals(d10)) {
                Pair<Integer, Integer> i10 = i(inputStream);
                try {
                    inputStream.close();
                } catch (IOException e15) {
                    e15.printStackTrace();
                }
                return i10;
            } else if ("VP8X".equals(d10)) {
                Pair<Integer, Integer> j10 = j(inputStream);
                try {
                    inputStream.close();
                } catch (IOException e16) {
                    e16.printStackTrace();
                }
                return j10;
            } else {
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e17) {
                    e17.printStackTrace();
                }
            }
            throw th;
        }
    }

    private static Pair<Integer, Integer> h(InputStream inputStream) throws IOException {
        inputStream.skip(7L);
        short f10 = f(inputStream);
        short f11 = f(inputStream);
        short f12 = f(inputStream);
        if (f10 == 157 && f11 == 1 && f12 == 42) {
            return new Pair<>(Integer.valueOf(b(inputStream)), Integer.valueOf(b(inputStream)));
        }
        return null;
    }

    private static Pair<Integer, Integer> i(InputStream inputStream) throws IOException {
        e(inputStream);
        if (c(inputStream) != 47) {
            return null;
        }
        int read = ((byte) inputStream.read()) & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
        int read2 = ((byte) inputStream.read()) & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
        return new Pair<>(Integer.valueOf((read | ((read2 & 63) << 8)) + 1), Integer.valueOf(((((((byte) inputStream.read()) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) & 15) << 10) | ((((byte) inputStream.read()) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 2) | ((read2 & DownloadResource.STATUS_RUNNING) >> 6)) + 1));
    }

    private static Pair<Integer, Integer> j(InputStream inputStream) throws IOException {
        inputStream.skip(8L);
        return new Pair<>(Integer.valueOf(k(inputStream) + 1), Integer.valueOf(k(inputStream) + 1));
    }

    private static int k(InputStream inputStream) throws IOException {
        byte c10 = c(inputStream);
        return ((c(inputStream) << 16) & 16711680) | ((c(inputStream) << 8) & 65280) | (c10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
    }
}
