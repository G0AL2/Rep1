package com.amazon.device.ads;

import com.amazon.device.ads.DTBMetricReport;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class DTBFetchManager {
    private static final int DEPTH = 3;
    private static int INSPECTION_INTERVAL_MS = 300000;
    private static final String LOG_TAG = "DTBFetchManager";
    private boolean isSmartBanner;
    private DTBAdLoader loader;
    private LinkedList<FetchEntry> responses;
    private boolean started = false;
    Timer timer = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class FetchEntry {
        DTBAdResponse response;
        long timestamp = new Date().getTime();

        FetchEntry(DTBAdResponse dTBAdResponse) {
            this.response = dTBAdResponse;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class ResponseListener implements DTBAdCallback {
        ResponseListener() {
        }

        @Override // com.amazon.device.ads.DTBAdCallback
        public void onFailure(AdError adError) {
            DTBFetchManager dTBFetchManager = DTBFetchManager.this;
            dTBFetchManager.addResponse(new FetchEntry(new DTBAdResponse()));
            DTBFetchManager.this.initiateRequest();
        }

        @Override // com.amazon.device.ads.DTBAdCallback
        public void onSuccess(DTBAdResponse dTBAdResponse) {
            DTBFetchManager dTBFetchManager = DTBFetchManager.this;
            dTBFetchManager.addResponse(new FetchEntry(dTBAdResponse));
            DTBFetchManager.this.initiateRequest();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DTBFetchManager(DTBAdLoader dTBAdLoader, boolean z10) {
        dTBAdLoader.pauseAutoRefresh();
        if (z10 && dTBAdLoader.getSlotGroupName() == null) {
            throw new IllegalStateException("No Slot Group Set for This Ad Request");
        }
        this.isSmartBanner = z10;
        init(dTBAdLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addResponse(FetchEntry fetchEntry) {
        synchronized (this.responses) {
            this.responses.add(fetchEntry);
        }
    }

    private void init(DTBAdLoader dTBAdLoader) {
        this.loader = dTBAdLoader;
        this.responses = new LinkedList<>();
        this.started = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initiateRequest() {
        if (!this.started || this.responses.size() >= 3) {
            return;
        }
        ((DTBAdRequest) this.loader).recycle();
        if (this.isSmartBanner) {
            try {
                this.loader.loadSmartBanner(new ResponseListener());
                return;
            } catch (DTBLoadException unused) {
                stop();
                DtbLog.error("DTBLoadException", "No suitable Slot Size");
                return;
            }
        }
        this.loader.loadAd(new ResponseListener());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void purgeResponses() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.responses) {
            long time = new Date().getTime();
            while (this.responses.size() > 0 && time - this.responses.getFirst().timestamp >= DTBFetchFactory.getInstance().getExpirationInMillis()) {
                FetchEntry removeFirst = this.responses.removeFirst();
                if (removeFirst.response.getBidId() != null) {
                    arrayList.add(new DTBMetricReport.BidWrapper(removeFirst.response.getBidId(), removeFirst.response.getHost()));
                }
                initiateRequest();
            }
        }
        submitExpiredBidsReport(arrayList);
    }

    private void submitExpiredBidsReport(List<DTBMetricReport.BidWrapper> list) {
        if (list.size() > 0) {
            DTBMetricsProcessor.getInstance().submitExpiredReport(list);
        }
    }

    public DTBAdResponse dispense() {
        FetchEntry poll;
        try {
            synchronized (this.responses) {
                poll = this.responses.poll();
            }
            r0 = poll != null ? poll.response : null;
            initiateRequest();
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute dispense method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute dispense method", e10);
        }
        return r0;
    }

    public boolean isEmpty() {
        return this.responses.isEmpty();
    }

    public DTBAdResponse peek() {
        FetchEntry peek;
        try {
            synchronized (this.responses) {
                peek = this.responses.peek();
            }
            if (peek != null) {
                return peek.response;
            }
            return null;
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute peek method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute peek method", e10);
            return null;
        }
    }

    public synchronized void start() {
        try {
            if (!this.started) {
                Timer timer = new Timer();
                this.timer = timer;
                timer.scheduleAtFixedRate(new TimerTask() { // from class: com.amazon.device.ads.DTBFetchManager.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        DTBFetchManager.this.purgeResponses();
                    }
                }, 0L, INSPECTION_INTERVAL_MS);
                this.started = true;
            }
            initiateRequest();
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute start method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute start method", e10);
        }
    }

    public synchronized void stop() {
        try {
            Timer timer = this.timer;
            if (timer != null) {
                timer.cancel();
                this.timer = null;
            }
            this.started = false;
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute stop method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute stop method", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void submitWasteQueueReport() {
        LinkedList<FetchEntry> linkedList = this.responses;
        if (linkedList == null || linkedList.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<FetchEntry> it = this.responses.iterator();
        while (it.hasNext()) {
            FetchEntry next = it.next();
            if (next.response.getBidId() != null) {
                arrayList.add(new DTBMetricReport.BidWrapper(next.response.getBidId(), next.response.getHost()));
            }
        }
        submitExpiredBidsReport(arrayList);
    }
}
