package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.s;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: ExoSoSource.java */
/* loaded from: classes.dex */
public final class i extends s {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExoSoSource.java */
    /* loaded from: classes.dex */
    public final class b extends s.g {

        /* renamed from: a  reason: collision with root package name */
        private final c[] f16523a;

        /* compiled from: ExoSoSource.java */
        /* loaded from: classes.dex */
        private final class a extends s.e {

            /* renamed from: a  reason: collision with root package name */
            private int f16524a;

            private a() {
            }

            @Override // com.facebook.soloader.s.e
            public boolean a() {
                return this.f16524a < b.this.f16523a.length;
            }

            @Override // com.facebook.soloader.s.e
            public s.d b() throws IOException {
                c[] cVarArr = b.this.f16523a;
                int i10 = this.f16524a;
                this.f16524a = i10 + 1;
                c cVar = cVarArr[i10];
                FileInputStream fileInputStream = new FileInputStream(cVar.f16526c);
                try {
                    return new s.f(cVar, fileInputStream);
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00dc, code lost:
            throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r10 + "]");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        b(com.facebook.soloader.i r17, com.facebook.soloader.s r18) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 289
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.i.b.<init>(com.facebook.soloader.i, com.facebook.soloader.s):void");
        }

        @Override // com.facebook.soloader.s.g
        public s.c a() throws IOException {
            return new s.c(this.f16523a);
        }

        @Override // com.facebook.soloader.s.g
        public s.e b() throws IOException {
            return new a();
        }
    }

    /* compiled from: ExoSoSource.java */
    /* loaded from: classes.dex */
    private static final class c extends s.b {

        /* renamed from: c  reason: collision with root package name */
        final File f16526c;

        c(String str, String str2, File file) {
            super(str, str2);
            this.f16526c = file;
        }
    }

    public i(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.soloader.s
    protected s.g s(byte b10) throws IOException {
        return new b(this, this);
    }
}
