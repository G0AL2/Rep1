package com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f19337a = Pattern.compile("^NOTE(( |\t).*)?$");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f19338b = Pattern.compile("^\ufeff?WEBVTT(( |\t).*)?$");

    public static long a(String str) throws NumberFormatException {
        String[] split = str.split("\\.", 2);
        long j10 = 0;
        for (String str2 : split[0].split(":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        return ((j10 * 1000) + Long.parseLong(split[1])) * 1000;
    }
}
