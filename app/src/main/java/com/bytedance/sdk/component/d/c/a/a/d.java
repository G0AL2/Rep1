package com.bytedance.sdk.component.d.c.a.a;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: Util.java */
/* loaded from: classes.dex */
final class d {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f10150a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    static final Charset f10151b = Charset.forName("UTF-8");

    /* JADX INFO: Access modifiers changed from: package-private */
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
}
