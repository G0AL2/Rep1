package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.Reference;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class s {
    public static StringBuffer a(InputStream inputStream, boolean z10) throws IOException {
        ByteBuffer b10 = d.f20241b.b();
        StringBuffer stringBuffer = new StringBuffer();
        d.f20241b.getClass();
        byte[] array = (b10 == null || !b10.hasArray()) ? new byte[Constants.BUFFER_SIZE] : b10.array();
        int i10 = 0;
        while (i10 != -1) {
            stringBuffer.append(new String(array, 0, i10));
            i10 = inputStream.read(array);
        }
        if (z10) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
        d.f20241b.f20242a.offer(b10);
        return stringBuffer;
    }

    public static void b(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static boolean a(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream != null) {
            byte[] bArr = new byte[Constants.MIN_PROGRESS_STEP];
            int i10 = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                i10 += read;
                outputStream.write(bArr, 0, read);
            }
            IAlog.a("Copied stream content length = %d", Integer.valueOf(i10));
            return i10 > 0;
        }
        throw new IOException("Unable to copy from or to a null stream.");
    }

    public static String a(Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            return "------\r\n" + stringWriter.toString() + "------\r\n";
        } catch (Exception unused) {
            return "bad stackToString";
        }
    }

    public static void a(View view) {
        if (view != null && view.getParent() != null) {
            try {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return;
                }
                ((ViewGroup) view.getParent()).removeView(view);
            } catch (Exception unused) {
            }
        }
    }

    public static String a(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i12 = i10; i12 >= 0 && i12 < i10 + i11 && i12 < stackTrace.length; i12++) {
            sb2.append(stackTrace[i12].toString());
            sb2.append(",");
        }
        Log.d("stack trace:", sb2.toString());
        return sb2.toString();
    }

    public static <T> T a(Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    public static int a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return i10;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static String a(Long l10) {
        return l10 == null ? "" : String.valueOf(l10);
    }
}
