package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: LocalContentUriFetchProducer.java */
/* loaded from: classes.dex */
public class c0 extends e0 {

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f14916c;

    public c0(Executor executor, b4.h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f14916c = contentResolver;
    }

    private w5.e g(Uri uri) throws IOException {
        try {
            ParcelFileDescriptor openFileDescriptor = this.f14916c.openFileDescriptor(uri, "r");
            return e(new FileInputStream(openFileDescriptor.getFileDescriptor()), (int) openFileDescriptor.getStatSize());
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected w5.e d(b6.b bVar) throws IOException {
        w5.e g10;
        InputStream createInputStream;
        Uri q10 = bVar.q();
        if (!g4.f.h(q10)) {
            return (!g4.f.g(q10) || (g10 = g(q10)) == null) ? e(this.f14916c.openInputStream(q10), -1) : g10;
        }
        if (q10.toString().endsWith("/photo")) {
            createInputStream = this.f14916c.openInputStream(q10);
        } else if (q10.toString().endsWith("/display_photo")) {
            try {
                createInputStream = this.f14916c.openAssetFileDescriptor(q10, "r").createInputStream();
            } catch (IOException unused) {
                throw new IOException("Contact photo does not exist: " + q10);
            }
        } else {
            InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f14916c, q10);
            if (openContactPhotoInputStream == null) {
                throw new IOException("Contact photo does not exist: " + q10);
            }
            createInputStream = openContactPhotoInputStream;
        }
        return e(createInputStream, -1);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected String f() {
        return "LocalContentUriFetchProducer";
    }
}
