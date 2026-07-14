class Solution {
    public String destCity(List<List<String>> paths) {
        
        HashSet<String> s = new HashSet<>();

        for(List <String> path : paths){
            s.add(path.get(0));

        }

        for(List<String> path : paths){

            String des = path.get(1);

            if(!s.contains(des)){
                return des;
            }
        }

        return ""; 
    }
}