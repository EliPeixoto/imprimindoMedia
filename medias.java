package ImprimindoMedia;

public class medias {
	double sequencia1;
	double sequencia2;
	double mediaSequencia1;
	double mediaSequencia2;
	double media;
	double mediaDasMedias;
	
	
	public double getMediaDasMedias1() {
		return mediaDasMedias;
	}

	public double getMediaSequencia1() {
		return sequencia1 / 3;
	}
	public void setMediaSequencia1(double mediaSequencia1) {
		this.mediaSequencia1 = mediaSequencia1;
	}
	
		public double getMediaSequencia2() {
		return sequencia2 / 3 ;
	}
	public void setMediaSequencia2(double mediaSequencia2) {
		this.mediaSequencia2 = mediaSequencia2;
	}
	double somaDasMedias;
	
	public double getSequencia1() {
		return sequencia1;
	}

	public double getSequencia2() {
		return sequencia2;
	}
	public void setSequencia1(double sequencia1) {
		this.sequencia1 = sequencia1;
	}
	public void setSequencia2(double sequencia2) {
		this.sequencia2 = sequencia2;
	}
	

	public double getSomaDasMedias() {
		return somaDasMedias;
	}
	public void setSomaDasMedias(double somaDasMedias) {
		this.somaDasMedias = somaDasMedias;
	}
	public double getMediaDasMedias() {
		return mediaDasMedias;
	}
	public void setMediaDasMedias(double mediaDasMedias) {
		this.mediaDasMedias = getSomaDasMedias() / media;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	
	
	
	
}
