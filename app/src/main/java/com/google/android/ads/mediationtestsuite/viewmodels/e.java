package com.google.android.ads.mediationtestsuite.viewmodels;

import org.jspecify.nullness.Nullable;

/* compiled from: ListItemViewModel.java */
/* loaded from: classes2.dex */
public interface e {

    /* compiled from: ListItemViewModel.java */
    /* loaded from: classes2.dex */
    public enum a {
        HEADER(1),
        INFO_LABEL(2),
        DETAIL_ITEM(3),
        AD_LOAD(4),
        REGISTER_TEST_DEVICE(5);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f20966a;

        a(int i10) {
            this.f20966a = i10;
        }

        @Nullable
        public static a h(int i10) {
            a[] values;
            for (a aVar : values()) {
                if (i10 == aVar.f20966a) {
                    return aVar;
                }
            }
            return null;
        }

        public int g() {
            return this.f20966a;
        }
    }

    a f();
}
