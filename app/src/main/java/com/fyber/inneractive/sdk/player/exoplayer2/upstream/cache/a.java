package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0261a extends IOException {
        public C0261a(String str) {
            super(str);
        }

        public C0261a(IOException iOException) {
            super(iOException);
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(a aVar, g gVar);

        void a(a aVar, g gVar, g gVar2);

        void b(a aVar, g gVar);
    }

    long a();

    long a(String str);

    File a(String str, long j10, long j11) throws C0261a;

    void a(g gVar) throws C0261a;

    void a(File file) throws C0261a;

    void a(String str, long j10) throws C0261a;

    g b(String str, long j10) throws InterruptedException, C0261a;

    void b(g gVar);

    g c(String str, long j10) throws C0261a;
}
