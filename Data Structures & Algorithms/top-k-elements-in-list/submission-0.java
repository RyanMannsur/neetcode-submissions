class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int key = nums[i];
            if(numsMap.containsKey(key)) {
                int value = numsMap.get(key);
                value++;
                numsMap.put(key,value);
            } else {
                numsMap.put(key, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> lista = new ArrayList<>(numsMap.entrySet());

        lista.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        Map<Integer, Integer> ordenado = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : lista) {
            ordenado.put(entry.getKey(), entry.getValue());
        }

        int[] resultado = new int[k]; 
        int i=0;
        for(Integer chave : ordenado.keySet()) {
            if (i == k) break; 
            resultado[i] = chave; 
            i++;
        }
        return resultado;
    }
}
