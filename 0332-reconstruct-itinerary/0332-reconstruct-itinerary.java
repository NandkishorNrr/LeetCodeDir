class Solution {
    private Map<String, List<String>> flightGraph; // Represents flights from one airport to another
    private List<String> travelItinerary; // Stores the final travel itinerary

    public List<String> findItinerary(List<List<String>> tickets) {
        // Initialize the flight graph using ticket information
        flightGraph = new HashMap<>();
        travelItinerary = new ArrayList<>() ;
        for (List<String> ticket : tickets) {
            String fromAirport = ticket.get(0);
            String toAirport = ticket.get(1);
            flightGraph.computeIfAbsent(fromAirport, k -> new ArrayList<>()).add(toAirport);
        }

        // Sort destinations in reverse order to visit lexical smaller destinations first
        for (List<String> destinations : flightGraph.values()) {
            destinations.sort(Collections.reverseOrder());
        }

        Stack<String> dfsStack = new Stack<>();
        dfsStack.push("JFK");

        while (!dfsStack.isEmpty()) {
            // Get the current airport from the top of the stack
            String currentAirport = dfsStack.peek();
            List<String> destinations = flightGraph.get(currentAirport);

            if (destinations != null && !destinations.isEmpty()) {
                // Choose the next destination (the one in lexicographically larger order)
                String nextDestination = destinations.remove(destinations.size() - 1);
                dfsStack.push(nextDestination);
            } else {
                // If there are no more destinations from the current airport, add it to the itinerary
                travelItinerary.add(currentAirport);
                dfsStack.pop();
            }
        }

        // Reverse the itinerary to get the correct order
        Collections.reverse(travelItinerary);
        return travelItinerary;
    }
}