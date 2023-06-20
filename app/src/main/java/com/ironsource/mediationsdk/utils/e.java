package com.ironsource.mediationsdk.utils;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractC1728b;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    d f27428b;

    /* renamed from: f  reason: collision with root package name */
    private String f27432f;

    /* renamed from: g  reason: collision with root package name */
    private Timer f27433g = null;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Integer> f27427a = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private Map<String, Integer> f27430d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f27431e = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public IronSourceLoggerManager f27429c = IronSourceLoggerManager.getLogger();

    public e(String str, d dVar) {
        this.f27432f = str;
        this.f27428b = dVar;
        a();
    }

    private void a(String str, int i10) {
        this.f27430d.put(str, Integer.valueOf(i10));
        this.f27431e.put(str, c());
        IronSourceUtils.saveIntToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), e(str), i10);
        IronSourceUtils.saveStringToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), f(str), c());
    }

    private int b(String str) {
        if (!c().equalsIgnoreCase(c(str))) {
            a(str);
        }
        return d(str);
    }

    private static Date b() {
        Random random = new Random();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, random.nextInt(10));
        gregorianCalendar.set(13, random.nextInt(60));
        gregorianCalendar.set(14, random.nextInt(1000));
        gregorianCalendar.add(5, 1);
        return gregorianCalendar.getTime();
    }

    private static String c() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    private String c(String str) {
        if (this.f27431e.containsKey(str)) {
            return this.f27431e.get(str);
        }
        String stringFromSharedPrefs = IronSourceUtils.getStringFromSharedPrefs(ContextProvider.getInstance().getApplicationContext(), f(str), c());
        this.f27431e.put(str, stringFromSharedPrefs);
        return stringFromSharedPrefs;
    }

    private int d(String str) {
        if (this.f27430d.containsKey(str)) {
            return this.f27430d.get(str).intValue();
        }
        int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(ContextProvider.getInstance().getApplicationContext(), e(str), 0);
        this.f27430d.put(str, Integer.valueOf(intFromSharedPrefs));
        return intFromSharedPrefs;
    }

    private static String e(String str) {
        return str + "_counter";
    }

    private static String f(String str) {
        return str + "_day";
    }

    void a() {
        Timer timer = this.f27433g;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.f27433g = timer2;
        timer2.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.utils.e.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                synchronized (eVar) {
                    try {
                        for (String str : eVar.f27427a.keySet()) {
                            eVar.a(str);
                        }
                        eVar.f27428b.g();
                        eVar.a();
                    } catch (Exception e10) {
                        eVar.f27429c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "onTimerTick", e10);
                    }
                }
            }
        }, b());
    }

    public final void a(AbstractC1728b abstractC1728b) {
        String d10;
        synchronized (this) {
            try {
                d10 = d(abstractC1728b);
            } catch (Exception e10) {
                this.f27429c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "increaseShowCounter", e10);
            }
            if (this.f27427a.containsKey(d10)) {
                a(d10, b(d10) + 1);
            }
        }
    }

    void a(String str) {
        this.f27430d.put(str, 0);
        this.f27431e.put(str, c());
        IronSourceUtils.saveIntToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), e(str), 0);
        IronSourceUtils.saveStringToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), f(str), c());
    }

    public final boolean b(AbstractC1728b abstractC1728b) {
        synchronized (this) {
            try {
                try {
                    String d10 = d(abstractC1728b);
                    if (this.f27427a.containsKey(d10)) {
                        if (c().equalsIgnoreCase(c(d10))) {
                            return false;
                        }
                        return this.f27427a.get(d10).intValue() <= d(d10);
                    }
                    return false;
                } catch (Exception e10) {
                    this.f27429c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "shouldSendCapReleasedEvent", e10);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(AbstractC1728b abstractC1728b) {
        synchronized (this) {
            try {
                try {
                    String d10 = d(abstractC1728b);
                    if (this.f27427a.containsKey(d10)) {
                        return this.f27427a.get(d10).intValue() <= b(d10);
                    }
                    return false;
                } catch (Exception e10) {
                    this.f27429c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "isCapped", e10);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String d(AbstractC1728b abstractC1728b) {
        return this.f27432f + "_" + abstractC1728b.f26983f + "_" + abstractC1728b.j();
    }
}
