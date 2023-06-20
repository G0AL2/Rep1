package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public final class k implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a {

    /* renamed from: a  reason: collision with root package name */
    public final File f19436a;

    /* renamed from: b  reason: collision with root package name */
    public final f f19437b;

    /* renamed from: d  reason: collision with root package name */
    public final i f19439d;

    /* renamed from: g  reason: collision with root package name */
    public a.C0261a f19442g;

    /* renamed from: f  reason: collision with root package name */
    public long f19441f = 0;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, g> f19438c = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, ArrayList<a.b>> f19440e = new HashMap<>();

    /* loaded from: classes2.dex */
    public class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ConditionVariable f19443a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f19443a = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (k.this) {
                this.f19443a.open();
                try {
                    k.a(k.this);
                } catch (a.C0261a e10) {
                    k.this.f19442g = e10;
                }
                k.this.f19437b.getClass();
            }
        }
    }

    public k(File file, f fVar, byte[] bArr) {
        this.f19436a = file;
        this.f19437b = fVar;
        this.f19439d = new i(file, null);
        ConditionVariable conditionVariable = new ConditionVariable();
        new a("SimpleCache.initialize()", conditionVariable).start();
        conditionVariable.block();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a
    public synchronized long a() {
        return this.f19441f;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a
    public g b(String str, long j10) throws InterruptedException, a.C0261a {
        l c10;
        synchronized (this) {
            while (true) {
                c10 = c(str, j10);
                if (c10 == null) {
                    wait();
                }
            }
        }
        return c10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a
    /* renamed from: d */
    public synchronized l c(String str, long j10) throws a.C0261a {
        l floor;
        l lVar;
        a.C0261a c0261a = this.f19442g;
        if (c0261a == null) {
            h hVar = this.f19439d.f19427a.get(str);
            if (hVar == null) {
                lVar = new l(str, j10, -1L, -9223372036854775807L, null);
            } else {
                while (true) {
                    l lVar2 = new l(hVar.f19424b, j10, -1L, -9223372036854775807L, null);
                    floor = hVar.f19425c.floor(lVar2);
                    if (floor == null || floor.f19418b + floor.f19419c <= j10) {
                        l ceiling = hVar.f19425c.ceiling(lVar2);
                        if (ceiling == null) {
                            floor = new l(hVar.f19424b, j10, -1L, -9223372036854775807L, null);
                        } else {
                            floor = new l(hVar.f19424b, j10, ceiling.f19418b - j10, -9223372036854775807L, null);
                        }
                    }
                    if (!floor.f19420d || floor.f19421e.length() == floor.f19419c) {
                        break;
                    }
                    b();
                }
                lVar = floor;
            }
            if (lVar.f19420d) {
                h hVar2 = this.f19439d.f19427a.get(str);
                com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(hVar2.f19425c.remove(lVar));
                int i10 = hVar2.f19423a;
                com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(lVar.f19420d);
                long currentTimeMillis = System.currentTimeMillis();
                File a10 = l.a(lVar.f19421e.getParentFile(), i10, lVar.f19418b, currentTimeMillis);
                l lVar3 = new l(lVar.f19417a, lVar.f19418b, lVar.f19419c, currentTimeMillis, a10);
                if (lVar.f19421e.renameTo(a10)) {
                    hVar2.f19425c.add(lVar3);
                    ArrayList<a.b> arrayList = this.f19440e.get(lVar.f19417a);
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            arrayList.get(size).a(this, lVar, lVar3);
                        }
                    }
                    j jVar = (j) this.f19437b;
                    jVar.f19434a.remove(lVar);
                    jVar.f19435b -= lVar.f19419c;
                    jVar.b(this, lVar3);
                    return lVar3;
                }
                throw new a.C0261a("Renaming of " + lVar.f19421e + " to " + a10 + " failed.");
            } else if (this.f19438c.containsKey(str)) {
                return null;
            } else {
                this.f19438c.put(str, lVar);
                return lVar;
            }
        }
        throw c0261a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a
    public synchronized File a(String str, long j10, long j11) throws a.C0261a {
        File file;
        h hVar;
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.f19438c.containsKey(str));
        if (!this.f19436a.exists()) {
            b();
            this.f19436a.mkdirs();
        }
        ((j) this.f19437b).a(this, j11);
        file = this.f19436a;
        i iVar = this.f19439d;
        hVar = iVar.f19427a.get(str);
        if (hVar == null) {
            hVar = iVar.a(str, -1L);
        }
        return l.a(file, hVar.f19423a, j10, System.currentTimeMillis());
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a
    public synchronized void b(g gVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(gVar == this.f19438c.remove(gVar.f19417a));
        notifyAll();
    }

    public final void b() throws a.C0261a {
        LinkedList linkedList = new LinkedList();
        for (h hVar : this.f19439d.f19427a.values()) {
            Iterator<l> it = hVar.f19425c.iterator();
            while (it.hasNext()) {
                l next = it.next();
                if (next.f19421e.length() != next.f19419c) {
                    linkedList.add(next);
                }
            }
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            a((g) it2.next(), false);
        }
        this.f19439d.b();
        this.f19439d.c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a
    public synchronized void a(File file) throws a.C0261a {
        l a10 = l.a(file, this.f19439d);
        boolean z10 = true;
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(a10 != null);
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.f19438c.containsKey(a10.f19417a));
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            String str = a10.f19417a;
            synchronized (this) {
                h hVar = this.f19439d.f19427a.get(str);
                Long valueOf = Long.valueOf(hVar == null ? -1L : hVar.f19426d);
                if (valueOf.longValue() != -1) {
                    if (a10.f19418b + a10.f19419c > valueOf.longValue()) {
                        z10 = false;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(z10);
                }
                a(a10);
                this.f19439d.c();
                notifyAll();
            }
        }
    }

    public static void a(k kVar) throws a.C0261a {
        if (!kVar.f19436a.exists()) {
            kVar.f19436a.mkdirs();
            return;
        }
        i iVar = kVar.f19439d;
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(!iVar.f19432f);
        if (!iVar.a()) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.b bVar = iVar.f19429c;
            bVar.f19544a.delete();
            bVar.f19545b.delete();
            iVar.f19427a.clear();
            iVar.f19428b.clear();
        }
        File[] listFiles = kVar.f19436a.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.getName().equals("cached_content_index.exi")) {
                l a10 = file.length() > 0 ? l.a(file, kVar.f19439d) : null;
                if (a10 != null) {
                    kVar.a(a10);
                } else {
                    file.delete();
                }
            }
        }
        kVar.f19439d.b();
        kVar.f19439d.c();
    }

    public final void a(l lVar) {
        i iVar = this.f19439d;
        String str = lVar.f19417a;
        h hVar = iVar.f19427a.get(str);
        if (hVar == null) {
            hVar = iVar.a(str, -1L);
        }
        hVar.f19425c.add(lVar);
        this.f19441f += lVar.f19419c;
        ArrayList<a.b> arrayList = this.f19440e.get(lVar.f19417a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).b(this, lVar);
            }
        }
        ((j) this.f19437b).b(this, lVar);
    }

    public final void a(g gVar, boolean z10) throws a.C0261a {
        boolean z11;
        h a10 = this.f19439d.a(gVar.f19417a);
        if (a10 != null) {
            if (a10.f19425c.remove(gVar)) {
                gVar.f19421e.delete();
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                this.f19441f -= gVar.f19419c;
                if (z10 && a10.f19425c.isEmpty()) {
                    this.f19439d.b(a10.f19424b);
                    this.f19439d.c();
                }
                ArrayList<a.b> arrayList = this.f19440e.get(gVar.f19417a);
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        arrayList.get(size).a(this, gVar);
                    }
                }
                j jVar = (j) this.f19437b;
                jVar.f19434a.remove(gVar);
                jVar.f19435b -= gVar.f19419c;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a
    public synchronized void a(g gVar) throws a.C0261a {
        a(gVar, true);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a
    public synchronized void a(String str, long j10) throws a.C0261a {
        i iVar = this.f19439d;
        h hVar = iVar.f19427a.get(str);
        if (hVar != null) {
            if (hVar.f19426d != j10) {
                hVar.f19426d = j10;
                iVar.f19432f = true;
            }
        } else {
            iVar.a(str, j10);
        }
        this.f19439d.c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a
    public synchronized long a(String str) {
        h hVar;
        hVar = this.f19439d.f19427a.get(str);
        return hVar == null ? -1L : hVar.f19426d;
    }
}
