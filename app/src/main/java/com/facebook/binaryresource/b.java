package com.facebook.binaryresource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import y3.k;

/* compiled from: FileBinaryResource.java */
/* loaded from: classes.dex */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final File f14465a;

    private b(File file) {
        this.f14465a = (File) k.g(file);
    }

    public static b b(File file) {
        return new b(file);
    }

    public static b c(File file) {
        if (file != null) {
            return new b(file);
        }
        return null;
    }

    @Override // com.facebook.binaryresource.a
    public InputStream a() throws IOException {
        return new FileInputStream(this.f14465a);
    }

    public File d() {
        return this.f14465a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return this.f14465a.equals(((b) obj).f14465a);
    }

    public int hashCode() {
        return this.f14465a.hashCode();
    }

    @Override // com.facebook.binaryresource.a
    public long size() {
        return this.f14465a.length();
    }
}
