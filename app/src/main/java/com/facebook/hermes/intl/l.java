package com.facebook.hermes.intl;

import android.os.Build;
import com.facebook.hermes.intl.h;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: LocaleResolver.java */
/* loaded from: classes.dex */
public class l {
    public static HashMap<String, Object> a(List<String> list, Object obj, List<String> list2) throws i5.d {
        h.a f10;
        HashMap<String, Object> hashMap = new HashMap<>();
        String h10 = i5.c.h(i5.c.a(obj, "localeMatcher"));
        if (Build.VERSION.SDK_INT >= 24 && !h10.equals("lookup")) {
            f10 = h.c((String[]) list.toArray(new String[list.size()]));
        } else {
            f10 = h.f((String[]) list.toArray(new String[list.size()]));
        }
        HashSet<String> hashSet = new HashSet();
        for (String str : list2) {
            Object b10 = i5.c.b();
            Object obj2 = b10;
            if (!f10.f14723b.isEmpty()) {
                obj2 = b10;
                if (f10.f14723b.containsKey(str)) {
                    String str2 = f10.f14723b.get(str);
                    boolean isEmpty = str2.isEmpty();
                    String str3 = str2;
                    if (isEmpty) {
                        str3 = i5.c.r(InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
                    }
                    hashSet.add(str);
                    obj2 = str3;
                }
            }
            if (i5.c.g(obj).containsKey(str)) {
                Object a10 = i5.c.a(obj, str);
                if (i5.c.m(a10) && i5.c.h(a10).isEmpty()) {
                    a10 = i5.c.o(true);
                }
                if (!i5.c.n(a10) && !a10.equals(obj2)) {
                    hashSet.remove(str);
                    obj2 = a10;
                }
            }
            if (!i5.c.j(obj2)) {
                obj2 = u.f(str, obj2);
            }
            if (i5.c.m(obj2) && !u.c(str, i5.c.h(obj2), f10.f14722a)) {
                hashMap.put(str, i5.c.b());
            } else {
                hashMap.put(str, obj2);
            }
        }
        for (String str4 : hashSet) {
            ArrayList<String> arrayList = new ArrayList<>();
            String h11 = i5.c.h(u.f(str4, i5.c.r(f10.f14723b.get(str4))));
            if (!i5.c.m(h11) || u.c(str4, i5.c.h(h11), f10.f14722a)) {
                arrayList.add(h11);
                f10.f14722a.f(str4, arrayList);
            }
        }
        hashMap.put("locale", f10.f14722a);
        return hashMap;
    }
}
