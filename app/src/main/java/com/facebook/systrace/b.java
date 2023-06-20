package com.facebook.systrace;

/* compiled from: SystraceMessage.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final AbstractC0223b f16573a = new c();

    /* compiled from: SystraceMessage.java */
    /* renamed from: com.facebook.systrace.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0223b {
        public abstract AbstractC0223b a(String str, int i10);

        public abstract AbstractC0223b b(String str, Object obj);

        public abstract void c();
    }

    /* compiled from: SystraceMessage.java */
    /* loaded from: classes.dex */
    private static class c extends AbstractC0223b {
        private c() {
        }

        @Override // com.facebook.systrace.b.AbstractC0223b
        public AbstractC0223b a(String str, int i10) {
            return this;
        }

        @Override // com.facebook.systrace.b.AbstractC0223b
        public AbstractC0223b b(String str, Object obj) {
            return this;
        }

        @Override // com.facebook.systrace.b.AbstractC0223b
        public void c() {
        }
    }

    public static AbstractC0223b a(long j10, String str) {
        return f16573a;
    }

    public static AbstractC0223b b(long j10) {
        return f16573a;
    }
}
