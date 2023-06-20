package com.fyber.inneractive.sdk.flow.vast;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public a f17310a;

    /* renamed from: b  reason: collision with root package name */
    public Object f17311b;

    /* loaded from: classes.dex */
    public enum a {
        BITRATE_NOT_IN_RANGE(1),
        UNSUPPORTED_MIME_TYPE(2),
        UNSUPPORTED_DELIVERY(3),
        UNSECURED_VIDEO_URL(4),
        VERTICAL_VIDEO_EXPECTED(5),
        FILTERED_BY_APP_OR_UNIT(6),
        NO_CONTENT(7);
        

        /* renamed from: a  reason: collision with root package name */
        public int f17320a;

        a(int i10) {
            this.f17320a = i10;
        }
    }

    public c(a aVar, Object obj) {
        this.f17310a = aVar;
        this.f17311b = obj;
    }

    public String toString() {
        return "Media File inc error::  type = " + this.f17310a + " expected value = " + this.f17311b;
    }
}
