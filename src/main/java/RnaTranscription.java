class RnaTranscription {

    String transcribe(String dnaStrand) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String rna = "";
        if(dnaStrand.isEmpty()){
            return "";
        }
        else{
            for(int i=0;i<dnaStrand.length();i++){
                if(dnaStrand.charAt(i)=='C'){
                    rna+="G";
                }
                else if(dnaStrand.charAt(i)=='G'){
                    rna+="C";
                }
                else if(dnaStrand.charAt(i)=='A'){
                    rna+="U";
                }
                else if(dnaStrand.charAt(i)=='T'){
                    rna+="A";
                }
                else{
                    System.out.println("Error in the DNA sequence");
                    break;
                }
            }
        }
        return rna;
    }
}
