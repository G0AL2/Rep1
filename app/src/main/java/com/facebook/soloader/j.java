package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.s;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: ExtractFromZipSoSource.java */
/* loaded from: classes.dex */
public class j extends s {

    /* renamed from: h  reason: collision with root package name */
    protected final File f16527h;

    /* renamed from: i  reason: collision with root package name */
    protected final String f16528i;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExtractFromZipSoSource.java */
    /* loaded from: classes.dex */
    public static final class b extends s.b implements Comparable {

        /* renamed from: c  reason: collision with root package name */
        final ZipEntry f16529c;

        /* renamed from: d  reason: collision with root package name */
        final int f16530d;

        b(String str, ZipEntry zipEntry, int i10) {
            super(str, a(zipEntry));
            this.f16529c = zipEntry;
            this.f16530d = i10;
        }

        private static String a(ZipEntry zipEntry) {
            return String.format("pseudo-zip-hash-1-%s-%s-%s-%s", zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc()));
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f16564a.compareTo(((b) obj).f16564a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: ExtractFromZipSoSource.java */
    /* loaded from: classes.dex */
    public class c extends s.g {

        /* renamed from: a  reason: collision with root package name */
        private b[] f16531a;

        /* renamed from: b  reason: collision with root package name */
        private final ZipFile f16532b;

        /* renamed from: c  reason: collision with root package name */
        private final s f16533c;

        /* compiled from: ExtractFromZipSoSource.java */
        /* loaded from: classes.dex */
        private final class a extends s.e {

            /* renamed from: a  reason: collision with root package name */
            private int f16535a;

            private a() {
            }

            @Override // com.facebook.soloader.s.e
            public boolean a() {
                c.this.h();
                return this.f16535a < c.this.f16531a.length;
            }

            @Override // com.facebook.soloader.s.e
            public s.d b() throws IOException {
                c.this.h();
                b[] bVarArr = c.this.f16531a;
                int i10 = this.f16535a;
                this.f16535a = i10 + 1;
                b bVar = bVarArr[i10];
                InputStream inputStream = c.this.f16532b.getInputStream(bVar.f16529c);
                try {
                    return new s.f(bVar, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(s sVar) throws IOException {
            this.f16532b = new ZipFile(j.this.f16527h);
            this.f16533c = sVar;
        }

        @Override // com.facebook.soloader.s.g
        public final s.c a() throws IOException {
            return new s.c(h());
        }

        @Override // com.facebook.soloader.s.g
        public final s.e b() throws IOException {
            return new a();
        }

        @Override // com.facebook.soloader.s.g, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f16532b.close();
        }

        final b[] h() {
            if (this.f16531a == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(j.this.f16528i);
                String[] j10 = SysUtil.j();
                Enumeration<? extends ZipEntry> entries = this.f16532b.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    Matcher matcher = compile.matcher(nextElement.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        int e10 = SysUtil.e(j10, group);
                        if (e10 >= 0) {
                            linkedHashSet.add(group);
                            b bVar = (b) hashMap.get(group2);
                            if (bVar == null || e10 < bVar.f16530d) {
                                hashMap.put(group2, new b(group2, nextElement, e10));
                            }
                        }
                    }
                }
                this.f16533c.w((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
                b[] bVarArr = (b[]) hashMap.values().toArray(new b[hashMap.size()]);
                Arrays.sort(bVarArr);
                int i10 = 0;
                for (int i11 = 0; i11 < bVarArr.length; i11++) {
                    b bVar2 = bVarArr[i11];
                    if (l(bVar2.f16529c, bVar2.f16564a)) {
                        i10++;
                    } else {
                        bVarArr[i11] = null;
                    }
                }
                b[] bVarArr2 = new b[i10];
                int i12 = 0;
                for (b bVar3 : bVarArr) {
                    if (bVar3 != null) {
                        bVarArr2[i12] = bVar3;
                        i12++;
                    }
                }
                this.f16531a = bVarArr2;
            }
            return this.f16531a;
        }

        protected boolean l(ZipEntry zipEntry, String str) {
            throw null;
        }
    }

    public j(Context context, String str, File file, String str2) {
        super(context, str);
        this.f16527h = file;
        this.f16528i = str2;
    }
}
