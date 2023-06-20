package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.Locale;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class IronSourceSegment {
    public static final String AGE = "age";
    public static final String GENDER = "gen";
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String USER_CREATION_DATE = "ucd";

    /* renamed from: a  reason: collision with root package name */
    private String f26311a;

    /* renamed from: g  reason: collision with root package name */
    private String f26317g;

    /* renamed from: b  reason: collision with root package name */
    private int f26312b = 999999;

    /* renamed from: c  reason: collision with root package name */
    private double f26313c = 999999.99d;

    /* renamed from: d  reason: collision with root package name */
    private final String f26314d = "custom";

    /* renamed from: e  reason: collision with root package name */
    private final int f26315e = 5;

    /* renamed from: f  reason: collision with root package name */
    private int f26316f = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f26318h = -1;

    /* renamed from: i  reason: collision with root package name */
    private AtomicBoolean f26319i = null;

    /* renamed from: j  reason: collision with root package name */
    private double f26320j = -1.0d;

    /* renamed from: k  reason: collision with root package name */
    private long f26321k = 0;

    /* renamed from: l  reason: collision with root package name */
    private Vector<Pair<String, String>> f26322l = new Vector<>();

    private static boolean a(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private static boolean a(String str, int i10, int i11) {
        return str != null && str.length() > 0 && str.length() <= 32;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Vector<Pair<String, String>> a() {
        Vector<Pair<String, String>> vector = new Vector<>();
        if (this.f26316f != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f26316f);
            vector.add(new Pair<>("age", sb2.toString()));
        }
        if (!TextUtils.isEmpty(this.f26317g)) {
            vector.add(new Pair<>(GENDER, this.f26317g));
        }
        if (this.f26318h != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f26318h);
            vector.add(new Pair<>(LEVEL, sb3.toString()));
        }
        if (this.f26319i != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f26319i);
            vector.add(new Pair<>(PAYING, sb4.toString()));
        }
        if (this.f26320j != -1.0d) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.f26320j);
            vector.add(new Pair<>(IAPT, sb5.toString()));
        }
        if (this.f26321k != 0) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(this.f26321k);
            vector.add(new Pair<>(USER_CREATION_DATE, sb6.toString()));
        }
        if (!TextUtils.isEmpty(this.f26311a)) {
            vector.add(new Pair<>("segName", this.f26311a));
        }
        vector.addAll(this.f26322l);
        return vector;
    }

    public int getAge() {
        return this.f26316f;
    }

    public String getGender() {
        return this.f26317g;
    }

    public double getIapt() {
        return this.f26320j;
    }

    public AtomicBoolean getIsPaying() {
        return this.f26319i;
    }

    public int getLevel() {
        return this.f26318h;
    }

    public String getSegmentName() {
        return this.f26311a;
    }

    public long getUcd() {
        return this.f26321k;
    }

    public void setAge(int i10) {
        if (i10 > 0 && i10 <= 199) {
            this.f26316f = i10;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setAge( " + i10 + " ) age must be between 1-199", 2);
    }

    public void setCustom(String str, String str2) {
        try {
            if (a(str) && a(str2) && a(str, 1, 32) && a(str2, 1, 32)) {
                String str3 = "custom_" + str;
                if (this.f26322l.size() >= 5) {
                    this.f26322l.remove(0);
                }
                this.f26322l.add(new Pair<>(str3, str2));
                return;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void setGender(String str) {
        if (!TextUtils.isEmpty(str)) {
            Locale locale = Locale.ENGLISH;
            if (str.toLowerCase(locale).equals("male") || str.toLowerCase(locale).equals("female")) {
                this.f26317g = str;
                return;
            }
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setGender( " + str + " ) is invalid", 2);
    }

    public void setIAPTotal(double d10) {
        if (d10 > 0.0d && d10 < this.f26313c) {
            this.f26320j = Math.floor(d10 * 100.0d) / 100.0d;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setIAPTotal( " + d10 + " ) iapt must be between 0-" + this.f26313c, 2);
    }

    public void setIsPaying(boolean z10) {
        if (this.f26319i == null) {
            this.f26319i = new AtomicBoolean();
        }
        this.f26319i.set(z10);
    }

    public void setLevel(int i10) {
        if (i10 > 0 && i10 < this.f26312b) {
            this.f26318h = i10;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setLevel( " + i10 + " ) level must be between 1-" + this.f26312b, 2);
    }

    public void setSegmentName(String str) {
        if (a(str) && a(str, 1, 32)) {
            this.f26311a = str;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length", 2);
    }

    public void setUserCreationDate(long j10) {
        if (j10 > 0) {
            this.f26321k = j10;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setUserCreationDate( " + j10 + " ) is an invalid timestamp", 2);
    }
}
