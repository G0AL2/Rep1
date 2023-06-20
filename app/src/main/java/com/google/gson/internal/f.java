package com.google.gson.internal;

import java.math.BigDecimal;

/* compiled from: LazilyParsedNumber.java */
/* loaded from: classes3.dex */
public final class f extends Number {

    /* renamed from: a  reason: collision with root package name */
    private final String f23858a;

    public f(String str) {
        this.f23858a = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f23858a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            String str = this.f23858a;
            String str2 = ((f) obj).f23858a;
            return str == str2 || str.equals(str2);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f23858a);
    }

    public int hashCode() {
        return this.f23858a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f23858a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f23858a).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f23858a);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f23858a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f23858a).longValue();
        }
    }

    public String toString() {
        return this.f23858a;
    }
}
