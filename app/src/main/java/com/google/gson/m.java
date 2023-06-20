package com.google.gson;

import java.math.BigInteger;

/* compiled from: JsonPrimitive.java */
/* loaded from: classes3.dex */
public final class m extends h {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?>[] f23893b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a  reason: collision with root package name */
    private Object f23894a;

    public m(Boolean bool) {
        x(bool);
    }

    private static boolean t(m mVar) {
        Object obj = mVar.f23894a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }
        return false;
    }

    private static boolean v(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : f23893b) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f23894a == null) {
            return mVar.f23894a == null;
        } else if (t(this) && t(mVar)) {
            return r().longValue() == mVar.r().longValue();
        } else {
            Object obj2 = this.f23894a;
            if ((obj2 instanceof Number) && (mVar.f23894a instanceof Number)) {
                double doubleValue = r().doubleValue();
                double doubleValue2 = mVar.r().doubleValue();
                if (doubleValue != doubleValue2) {
                    return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
                }
                return true;
            }
            return obj2.equals(mVar.f23894a);
        }
    }

    @Override // com.google.gson.h
    public String h() {
        if (u()) {
            return r().toString();
        }
        if (s()) {
            return n().toString();
        }
        return (String) this.f23894a;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f23894a == null) {
            return 31;
        }
        if (t(this)) {
            doubleToLongBits = r().longValue();
        } else {
            Object obj = this.f23894a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(r().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public boolean m() {
        if (s()) {
            return n().booleanValue();
        }
        return Boolean.parseBoolean(h());
    }

    Boolean n() {
        return (Boolean) this.f23894a;
    }

    public double o() {
        return u() ? r().doubleValue() : Double.parseDouble(h());
    }

    public int p() {
        return u() ? r().intValue() : Integer.parseInt(h());
    }

    public long q() {
        return u() ? r().longValue() : Long.parseLong(h());
    }

    public Number r() {
        Object obj = this.f23894a;
        return obj instanceof String ? new com.google.gson.internal.f((String) obj) : (Number) obj;
    }

    public boolean s() {
        return this.f23894a instanceof Boolean;
    }

    public boolean u() {
        return this.f23894a instanceof Number;
    }

    public boolean w() {
        return this.f23894a instanceof String;
    }

    void x(Object obj) {
        if (obj instanceof Character) {
            this.f23894a = String.valueOf(((Character) obj).charValue());
            return;
        }
        com.google.gson.internal.a.a((obj instanceof Number) || v(obj));
        this.f23894a = obj;
    }

    public m(Number number) {
        x(number);
    }

    public m(String str) {
        x(str);
    }
}
