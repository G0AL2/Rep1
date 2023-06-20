package com.brentvatne.exoplayer;

import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VideoEventEmitter.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: c  reason: collision with root package name */
    static final String[] f9194c = {"onVideoLoadStart", "onVideoLoad", "onVideoError", "onVideoProgress", "onVideoSeek", "onVideoEnd", "onVideoFullscreenPlayerWillPresent", "onVideoFullscreenPlayerDidPresent", "onVideoFullscreenPlayerWillDismiss", "onVideoFullscreenPlayerDidDismiss", "onPlaybackStalled", "onPlaybackResume", "onReadyForDisplay", "onVideoBuffer", "onVideoPlaybackStateChanged", "onVideoIdle", "onTimedMetadata", "onVideoAudioBecomingNoisy", "onAudioFocusChanged", "onPlaybackRateChange", "onVideoBandwidthUpdate"};

    /* renamed from: a  reason: collision with root package name */
    private final RCTEventEmitter f9195a;

    /* renamed from: b  reason: collision with root package name */
    private int f9196b = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(ReactContext reactContext) {
        this.f9195a = (RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class);
    }

    private void s(String str, WritableMap writableMap) {
        this.f9195a.receiveEvent(this.f9196b, str, writableMap);
    }

    void a(String str, Exception exc, String str2) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("errorString", str);
        createMap.putString("errorException", exc.toString());
        createMap.putString(IronSourceConstants.EVENTS_ERROR_CODE, str2);
        createMap.putString("errorStackTrace", stringWriter2);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("error", createMap);
        s("onVideoError", createMap2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        s("onVideoAudioBecomingNoisy", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(boolean z10) {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("hasAudioFocus", z10);
        s("onAudioFocusChanged", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(double d10, int i10, int i11, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("bitrate", d10);
        createMap.putInt("width", i11);
        createMap.putInt("height", i10);
        createMap.putString("trackId", str);
        s("onVideoBandwidthUpdate", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(boolean z10) {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isBuffering", z10);
        s("onVideoBuffer", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        s("onVideoEnd", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(String str, Exception exc, String str2) {
        a(str, exc, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        s("onVideoFullscreenPlayerDidDismiss", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        s("onVideoFullscreenPlayerDidPresent", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        s("onVideoFullscreenPlayerWillDismiss", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        s("onVideoFullscreenPlayerWillPresent", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        s("onVideoIdle", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(double d10, double d11, int i10, int i11, WritableArray writableArray, WritableArray writableArray2, WritableArray writableArray3, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("duration", d10 / 1000.0d);
        createMap.putDouble("currentTime", d11 / 1000.0d);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("width", i10);
        createMap2.putInt("height", i11);
        if (i10 > i11) {
            createMap2.putString(AdUnitActivity.EXTRA_ORIENTATION, DtbDeviceDataRetriever.ORIENTATION_LANDSCAPE);
        } else {
            createMap2.putString(AdUnitActivity.EXTRA_ORIENTATION, DtbDeviceDataRetriever.ORIENTATION_PORTRAIT);
        }
        createMap.putMap("naturalSize", createMap2);
        createMap.putString("trackId", str);
        createMap.putArray("videoTracks", writableArray3);
        createMap.putArray("audioTracks", writableArray);
        createMap.putArray("textTracks", writableArray2);
        createMap.putBoolean("canPlayFastForward", true);
        createMap.putBoolean("canPlaySlowForward", true);
        createMap.putBoolean("canPlaySlowReverse", true);
        createMap.putBoolean("canPlayReverse", true);
        createMap.putBoolean("canPlayFastForward", true);
        createMap.putBoolean("canStepBackward", true);
        createMap.putBoolean("canStepForward", true);
        s("onVideoLoad", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        s("onVideoLoadStart", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(float f10) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("playbackRate", f10);
        s("onPlaybackRateChange", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(boolean z10) {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isPlaying", z10);
        s("onVideoPlaybackStateChanged", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(double d10, double d11, double d12, double d13) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("currentTime", d10 / 1000.0d);
        createMap.putDouble("playableDuration", d11 / 1000.0d);
        createMap.putDouble("seekableDuration", d12 / 1000.0d);
        createMap.putDouble("currentPlaybackTime", d13);
        s("onVideoProgress", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        s("onReadyForDisplay", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(long j10, long j11) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("currentTime", j10 / 1000.0d);
        createMap.putDouble("seekTime", j11 / 1000.0d);
        s("onVideoSeek", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int i10) {
        this.f9196b = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(Metadata metadata) {
        WritableArray createArray = Arguments.createArray();
        for (int i10 = 0; i10 < metadata.g(); i10++) {
            Metadata.Entry f10 = metadata.f(i10);
            if (f10 instanceof Id3Frame) {
                Id3Frame id3Frame = (Id3Frame) f10;
                String str = id3Frame instanceof TextInformationFrame ? ((TextInformationFrame) id3Frame).f21210c : "";
                String str2 = id3Frame.f21198a;
                WritableMap createMap = Arguments.createMap();
                createMap.putString("identifier", str2);
                createMap.putString(AppMeasurementSdk.ConditionalUserProperty.VALUE, str);
                createArray.pushMap(createMap);
            } else if (f10 instanceof EventMessage) {
                EventMessage eventMessage = (EventMessage) f10;
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putString("identifier", eventMessage.f21148a);
                createMap2.putString(AppMeasurementSdk.ConditionalUserProperty.VALUE, eventMessage.f21149b);
                createArray.pushMap(createMap2);
            }
        }
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putArray("metadata", createArray);
        s("onTimedMetadata", createMap3);
    }
}
