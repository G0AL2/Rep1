package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class N {

    /* renamed from: c  reason: collision with root package name */
    L f26416c;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f26419f;

    /* renamed from: g  reason: collision with root package name */
    private final int f26420g;

    /* renamed from: a  reason: collision with root package name */
    ConcurrentHashMap<String, CopyOnWriteArrayList<L>> f26414a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    String f26415b = "";

    /* renamed from: e  reason: collision with root package name */
    private String f26418e = "";

    /* renamed from: h  reason: collision with root package name */
    private final Timer f26421h = new Timer();

    /* renamed from: d  reason: collision with root package name */
    ConcurrentHashMap<String, AdInfo> f26417d = new ConcurrentHashMap<>();

    public N(List<String> list, int i10) {
        this.f26419f = list;
        this.f26420g = i10;
    }

    private synchronized boolean c() {
        boolean z10;
        L l10 = this.f26416c;
        if (l10 != null) {
            z10 = l10.f26390b.equals(this.f26418e);
        }
        return z10;
    }

    private void d() {
        Iterator<L> it = a().iterator();
        while (it.hasNext()) {
            L next = it.next();
            if (!next.equals(this.f26416c)) {
                next.d();
            }
        }
    }

    public final AdInfo a(String str) {
        if (this.f26417d.containsKey(str)) {
            return this.f26417d.get(str);
        }
        return null;
    }

    public final CopyOnWriteArrayList<L> a() {
        CopyOnWriteArrayList<L> copyOnWriteArrayList = this.f26414a.get(this.f26415b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public final synchronized void a(L l10) {
        IronLog.INTERNAL.verbose("");
        L l11 = this.f26416c;
        if (l11 != null && !l11.equals(l10)) {
            this.f26416c.d();
        }
        this.f26416c = l10;
    }

    public final void a(String str, ImpressionData impressionData) {
        if (TextUtils.isEmpty(str) || impressionData == null) {
            return;
        }
        this.f26417d.put(str, new AdInfo(impressionData));
    }

    public final void a(CopyOnWriteArrayList<L> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        d();
        this.f26414a.put(str, copyOnWriteArrayList);
        if (!TextUtils.isEmpty(this.f26418e)) {
            if (c()) {
                ironLog.verbose("ad from previous waterfall " + this.f26418e + " is still showing - the current waterfall " + this.f26415b + " will be deleted instead");
                String str2 = this.f26415b;
                this.f26415b = this.f26418e;
                this.f26418e = str2;
            }
            final String str3 = this.f26418e;
            this.f26421h.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.N.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    try {
                        IronLog ironLog2 = IronLog.INTERNAL;
                        ironLog2.verbose("removing waterfall with id " + str3 + " from memory");
                        N.this.f26414a.remove(str3);
                        ironLog2.verbose("waterfall size is currently " + N.this.f26414a.size());
                        ironLog2.verbose("removing adInfo with id " + str3 + " from memory");
                        N.this.f26417d.remove(str3);
                        ironLog2.verbose("adInfo size is currently " + N.this.f26417d.size());
                    } finally {
                        cancel();
                    }
                }
            }, this.f26420g);
        }
        this.f26418e = this.f26415b;
        this.f26415b = str;
    }

    public final boolean b() {
        return this.f26414a.size() > 5;
    }

    public final synchronized boolean b(L l10) {
        boolean z10;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        if (l10 != null && (this.f26416c == null || ((l10.c() != LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK || !this.f26416c.k().equals(l10.k())) && ((l10.c() != LoadWhileShowSupportState.NONE && !this.f26419f.contains(l10.l())) || !this.f26416c.l().equals(l10.l()))))) {
            z10 = false;
            if (z10 && l10 != null) {
                ironLog.verbose(l10.k() + " does not support load while show and will not be added to the auction request");
            }
        }
        z10 = true;
        if (z10) {
            ironLog.verbose(l10.k() + " does not support load while show and will not be added to the auction request");
        }
        return !z10;
    }
}
