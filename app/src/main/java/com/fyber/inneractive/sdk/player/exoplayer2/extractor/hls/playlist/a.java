package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import com.fyber.inneractive.sdk.player.exoplayer2.i;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: b  reason: collision with root package name */
    public final List<C0250a> f18312b;

    /* renamed from: c  reason: collision with root package name */
    public final List<C0250a> f18313c;

    /* renamed from: d  reason: collision with root package name */
    public final List<C0250a> f18314d;

    /* renamed from: e  reason: collision with root package name */
    public final i f18315e;

    /* renamed from: f  reason: collision with root package name */
    public final List<i> f18316f;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0250a {

        /* renamed from: a  reason: collision with root package name */
        public final String f18317a;

        /* renamed from: b  reason: collision with root package name */
        public final i f18318b;

        public C0250a(String str, i iVar) {
            this.f18317a = str;
            this.f18318b = iVar;
        }
    }

    public a(String str, List<C0250a> list, List<C0250a> list2, List<C0250a> list3, i iVar, List<i> list4) {
        super(str);
        this.f18312b = Collections.unmodifiableList(list);
        this.f18313c = Collections.unmodifiableList(list2);
        this.f18314d = Collections.unmodifiableList(list3);
        this.f18315e = iVar;
        this.f18316f = list4 != null ? Collections.unmodifiableList(list4) : null;
    }
}
