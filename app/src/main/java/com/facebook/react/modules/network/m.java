package com.facebook.react.modules.network;

import android.content.Context;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.GZIPOutputStream;
import mf.e0;
import mf.r;
import ye.c0;
import ye.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RequestBodyUtil.java */
/* loaded from: classes.dex */
public class m {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RequestBodyUtil.java */
    /* loaded from: classes.dex */
    public class a extends c0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f15606a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InputStream f15607b;

        a(x xVar, InputStream inputStream) {
            this.f15606a = xVar;
            this.f15607b = inputStream;
        }

        @Override // ye.c0
        public long contentLength() {
            try {
                return this.f15607b.available();
            } catch (IOException unused) {
                return 0L;
            }
        }

        @Override // ye.c0
        public x contentType() {
            return this.f15606a;
        }

        @Override // ye.c0
        public void writeTo(mf.g gVar) throws IOException {
            e0 e0Var = null;
            try {
                e0Var = r.k(this.f15607b);
                gVar.t(e0Var);
            } finally {
                ze.c.j(e0Var);
            }
        }
    }

    public static c0 a(x xVar, InputStream inputStream) {
        return new a(xVar, inputStream);
    }

    public static c0 b(x xVar, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            return c0.create(xVar, byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            return null;
        }
    }

    public static i c(c0 c0Var, h hVar) {
        return new i(c0Var, hVar);
    }

    private static InputStream d(Context context, Uri uri) throws IOException {
        File createTempFile = File.createTempFile("RequestBodyUtil", "temp", context.getApplicationContext().getCacheDir());
        createTempFile.deleteOnExit();
        InputStream openStream = new URL(uri.toString()).openStream();
        try {
            ReadableByteChannel newChannel = Channels.newChannel(openStream);
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            try {
                fileOutputStream.getChannel().transferFrom(newChannel, 0L, Long.MAX_VALUE);
                FileInputStream fileInputStream = new FileInputStream(createTempFile);
                newChannel.close();
                return fileInputStream;
            } finally {
                fileOutputStream.close();
            }
        } finally {
            openStream.close();
        }
    }

    public static c0 e(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH")) {
            return c0.create((x) null, mf.i.f34461d);
        }
        return null;
    }

    public static InputStream f(Context context, String str) {
        try {
            Uri parse = Uri.parse(str);
            if (parse.getScheme().startsWith("http")) {
                return d(context, parse);
            }
            return context.getContentResolver().openInputStream(parse);
        } catch (Exception e10) {
            z3.a.k("ReactNative", "Could not retrieve file for contentUri " + str, e10);
            return null;
        }
    }

    public static boolean g(String str) {
        return "gzip".equalsIgnoreCase(str);
    }
}
