package com.fyber.inneractive.sdk.player.cache;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f17851a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    public static void a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }
}
