package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class r implements Comparable<r> {

    /* renamed from: a  reason: collision with root package name */
    public Integer[] f17477a = new Integer[0];

    /* renamed from: b  reason: collision with root package name */
    public final String f17478b;

    /* loaded from: classes.dex */
    public static class a extends Exception {
    }

    public r(String str) throws a {
        b(str);
        a(str);
        this.f17478b = str;
    }

    public final void a(String str) throws a {
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split("\\.")) {
            arrayList.add(Integer.valueOf(com.fyber.inneractive.sdk.util.s.a(str2, 0)));
        }
        this.f17477a = (Integer[]) arrayList.toArray(new Integer[arrayList.size()]);
    }

    public final void b(String str) throws a {
        if (TextUtils.isEmpty(str) || !str.matches("^[0-9.]+$")) {
            throw new a();
        }
    }

    public String toString() {
        return this.f17478b;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(r rVar) {
        if (rVar == null) {
            return 1;
        }
        int max = Math.max(this.f17477a.length, rVar.f17477a.length);
        int i10 = 0;
        while (i10 < max) {
            Integer[] numArr = this.f17477a;
            int intValue = numArr.length > i10 ? numArr[i10].intValue() : 0;
            Integer[] numArr2 = rVar.f17477a;
            int intValue2 = numArr2.length > i10 ? numArr2[i10].intValue() : 0;
            if (intValue > intValue2) {
                return 1;
            }
            if (intValue2 > intValue) {
                return -1;
            }
            i10++;
        }
        return 0;
    }
}
