package com.applovin.impl.a;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static final DateFormat f6793a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* renamed from: b  reason: collision with root package name */
    private static final Random f6794b = new Random(System.currentTimeMillis());

    public static Uri a(String str, long j10, Uri uri, f fVar, com.applovin.impl.sdk.m mVar) {
        if (!URLUtil.isValidUrl(str)) {
            if (v.a()) {
                mVar.A().e("VastUtils", "Unable to replace macros in invalid URL string.");
            }
            return null;
        }
        try {
            String num = Integer.toString(fVar.a());
            String replace = str.replace("[ERRORCODE]", num).replace("[REASON]", num);
            if (j10 >= 0) {
                replace = replace.replace("[CONTENTPLAYHEAD]", a(j10));
            }
            if (uri != null) {
                replace = replace.replace("[ASSETURI]", uri.toString());
            }
            return Uri.parse(replace.replace("[CACHEBUSTING]", a()).replace("[TIMESTAMP]", b()));
        } catch (Throwable th) {
            if (v.a()) {
                v A = mVar.A();
                A.b("VastUtils", "Unable to replace macros in URL string " + str, th);
            }
            return null;
        }
    }

    public static f a(a aVar) {
        if (b(aVar) || c(aVar)) {
            return null;
        }
        return f.GENERAL_WRAPPER_ERROR;
    }

    private static String a() {
        return Integer.toString(f6794b.nextInt(89999999) + 10000000);
    }

    private static String a(long j10) {
        if (j10 > 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long hours = timeUnit.toHours(j10);
            long minutes = timeUnit.toMinutes(j10);
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            return String.format(Locale.US, "%02d:%02d:%02d.000", Long.valueOf(hours), Long.valueOf(minutes % timeUnit2.toSeconds(1L)), Long.valueOf(j10 % timeUnit2.toSeconds(1L)));
        }
        return "00:00:00.000";
    }

    public static String a(e eVar) {
        r c10;
        if (eVar != null) {
            List<r> b10 = eVar.b();
            int size = eVar.b().size();
            if (size <= 0 || (c10 = b10.get(size - 1).c("VASTAdTagURI")) == null) {
                return null;
            }
            return c10.c();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    public static String a(r rVar, String str, String str2) {
        r b10 = rVar.b(str);
        if (b10 != null) {
            String c10 = b10.c();
            if (StringUtils.isValidString(c10)) {
                return c10;
            }
        }
        return str2;
    }

    private static Set<j> a(e eVar, com.applovin.impl.sdk.m mVar) {
        if (eVar != null) {
            List<r> b10 = eVar.b();
            Set<j> hashSet = new HashSet<>(b10.size());
            for (r rVar : b10) {
                r c10 = rVar.c("Wrapper");
                if (c10 == null) {
                    c10 = rVar.c("InLine");
                }
                hashSet = a(hashSet, c10 != null ? c10.a("Error") : rVar.a("Error"), eVar, mVar);
            }
            if (v.a()) {
                v A = mVar.A();
                A.b("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
            }
            return hashSet;
        }
        return null;
    }

    private static Set<j> a(Set<j> set, List<r> list, e eVar, com.applovin.impl.sdk.m mVar) {
        if (list != null) {
            for (r rVar : list) {
                j a10 = j.a(rVar, eVar, mVar);
                if (a10 != null) {
                    set.add(a10);
                }
            }
        }
        return set;
    }

    public static void a(e eVar, AppLovinAdLoadListener appLovinAdLoadListener, f fVar, int i10, com.applovin.impl.sdk.m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
        }
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i10);
        }
        a(a(eVar, mVar), fVar, mVar);
    }

    public static void a(r rVar, Map<String, Set<j>> map, e eVar, com.applovin.impl.sdk.m mVar) {
        List<r> a10;
        if (mVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (rVar == null) {
            if (v.a()) {
                mVar.A().e("VastUtils", "Unable to render event trackers; null node provided");
            }
        } else if (map == null) {
            if (v.a()) {
                mVar.A().e("VastUtils", "Unable to render event trackers; null event trackers provided");
            }
        } else {
            r b10 = rVar.b("TrackingEvents");
            if (b10 == null || (a10 = b10.a("Tracking")) == null) {
                return;
            }
            for (r rVar2 : a10) {
                String str = rVar2.b().get("event");
                if (StringUtils.isValidString(str)) {
                    j a11 = j.a(rVar2, eVar, mVar);
                    if (a11 != null) {
                        Set<j> set = map.get(str);
                        if (set != null) {
                            set.add(a11);
                        } else {
                            HashSet hashSet = new HashSet();
                            hashSet.add(a11);
                            map.put(str, hashSet);
                        }
                    }
                } else if (v.a()) {
                    v A = mVar.A();
                    A.e("VastUtils", "Could not find event for tracking node = " + rVar2);
                }
            }
        }
    }

    public static void a(List<r> list, Set<j> set, e eVar, com.applovin.impl.sdk.m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            if (v.a()) {
                mVar.A().e("VastUtils", "Unable to render trackers; null nodes provided");
            }
        } else if (set == null) {
            if (v.a()) {
                mVar.A().e("VastUtils", "Unable to render trackers; null trackers provided");
            }
        } else {
            for (r rVar : list) {
                j a10 = j.a(rVar, eVar, mVar);
                if (a10 != null) {
                    set.add(a10);
                }
            }
        }
    }

    public static void a(Set<j> set, long j10, Uri uri, f fVar, com.applovin.impl.sdk.m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
        }
        if (set == null || set.isEmpty()) {
            return;
        }
        for (j jVar : set) {
            Uri a10 = a(jVar.b(), j10, uri, fVar, mVar);
            if (a10 != null) {
                mVar.U().a(com.applovin.impl.sdk.network.h.o().c(a10.toString()).a(false).a(), false);
            }
        }
    }

    public static void a(Set<j> set, f fVar, com.applovin.impl.sdk.m mVar) {
        a(set, -1L, (Uri) null, fVar, mVar);
    }

    public static void a(Set<j> set, com.applovin.impl.sdk.m mVar) {
        a(set, -1L, (Uri) null, f.UNSPECIFIED, mVar);
    }

    public static boolean a(r rVar) {
        if (rVar != null) {
            return rVar.c("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    private static String b() {
        DateFormat dateFormat = f6793a;
        dateFormat.setTimeZone(TimeZone.getDefault());
        return dateFormat.format(new Date());
    }

    public static boolean b(a aVar) {
        m m10;
        List<n> a10;
        return (aVar == null || (m10 = aVar.m()) == null || (a10 = m10.a()) == null || a10.isEmpty()) ? false : true;
    }

    public static boolean b(r rVar) {
        if (rVar != null) {
            return rVar.c("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    public static boolean c(a aVar) {
        d aM;
        h b10;
        if (aVar == null || (aM = aVar.aM()) == null || (b10 = aM.b()) == null) {
            return false;
        }
        return b10.b() != null || StringUtils.isValidString(b10.c());
    }
}
