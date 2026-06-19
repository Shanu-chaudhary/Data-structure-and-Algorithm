class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        int n = words.length;
        
        while (i < n) {
            // Step 1: Greedily group words for this line
            List<String> line = new ArrayList<>();
            int lineLength = 0;
            
            while (i < n && (lineLength + line.size() + words[i].length() <= maxWidth)) {
                line.add(words[i]);
                lineLength += words[i].length();
                i++;
            }
            
            // Step 2: Justify this line
            StringBuilder sb = new StringBuilder();
            int numWords = line.size();
            int totalSpaces = maxWidth - lineLength;
            
            boolean isLastLine = (i == n);
            
            if (isLastLine || numWords == 1) {
                // Left-justify: single space between words, pad end with spaces
                for (int j = 0; j < numWords; j++) {
                    sb.append(line.get(j));
                    if (j != numWords - 1) {
                        sb.append(' ');
                    }
                }
                while (sb.length() < maxWidth) {
                    sb.append(' ');
                }
            } else {
                // Fully justify: distribute spaces evenly, extra spaces go to left gaps
                int gaps = numWords - 1;
                int spacesPerGap = totalSpaces / gaps;
                int extraSpaces = totalSpaces % gaps;
                
                for (int j = 0; j < numWords; j++) {
                    sb.append(line.get(j));
                    if (j != numWords - 1) {
                        int spacesToAdd = spacesPerGap + (j < extraSpaces ? 1 : 0);
                        for (int k = 0; k < spacesToAdd; k++) {
                            sb.append(' ');
                        }
                    }
                }
            }
            
            result.add(sb.toString());
        }
        
        return result;
    }
}