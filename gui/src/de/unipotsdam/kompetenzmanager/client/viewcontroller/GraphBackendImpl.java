package de.unipotsdam.kompetenzmanager.client.viewcontroller;

import java.util.Collection;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

import de.unipotsdam.kompetenzmanager.client.ShowCompetenceBinder2;
import de.unipotsdam.kompetenzmanager.shared.Graph;
import de.unipotsdam.kompetenzmanager.shared.GraphLiteraturePair;
import de.unipotsdam.kompetenzmanager.shared.GraphNode;
import de.unipotsdam.kompetenzmanager.shared.Literature;
import de.unipotsdam.kompetenzmanager.shared.LiteratureEntry;

public class GraphBackendImpl implements GraphBackendAsync {
	
	private ShowCompetenceBinder2 showCompetenceBinder;

	public GraphBackendImpl(ShowCompetenceBinder2 showCompetenceBinder) {
		this.showCompetenceBinder = showCompetenceBinder;
	}

	/**
	 * Create a remote service proxy to talk to the server-side service.
	 */
	private final GraphBackendAsync graphBackEnd = GWT
			.create(GraphBackend.class);

	@Override
	public synchronized void getFullGraph(AsyncCallback<Graph> graph) {
		graphBackEnd.getFullGraph(new GraphUpdater<Graph>(showCompetenceBinder));
	}

	@Override
	public synchronized void addNode(GraphNode sourceNode, GraphNode newNode,
			String kantenLabel, AsyncCallback<Graph> callback) {
		if (callback == null) {
			callback = new GraphUpdater<Graph>(showCompetenceBinder);
		}
		graphBackEnd.addNode(sourceNode, newNode, kantenLabel, callback);
	}

	@Override
	public synchronized void findShortestPath(String keyword, AsyncCallback<Graph> callback) {
		if (callback == null) {
			callback = new GraphUpdater<Graph>(showCompetenceBinder);
		}
		graphBackEnd.findShortestPath(keyword, new GraphUpdater<Graph>(showCompetenceBinder));
	}

	@Override
	public synchronized void removeNode(GraphNode targetNode, AsyncCallback<Graph> callback) {
		if (callback == null) {
			callback = new GraphUpdater<Graph>(showCompetenceBinder);
		}
		graphBackEnd.removeNode(targetNode, callback);
	}

	@Override
	public synchronized void findShortestPath(String fromNode, String toNode,
			AsyncCallback<Graph> graphUpdater) {
		graphBackEnd.findShortestPath(fromNode, toNode, graphUpdater);		
	}

	@Override
	public synchronized void expandNode(String nodeName, AsyncCallback<Graph> graphUpdater) {
		graphBackEnd.expandNode(nodeName, graphUpdater);		
	}

	@Override
	public synchronized void addNode(Graph graph, GraphNode sourceNode, GraphNode newNode,
			String kantenLabel, AsyncCallback<Graph> callback) {
		graphBackEnd.addNode(graph, sourceNode, newNode, kantenLabel, callback);
		
	}

	@Override
	public synchronized void findShortestPath(Graph graph, String keyword,
			AsyncCallback<Graph> callback) {
		graphBackEnd.findShortestPath(graph, keyword, callback);
		
	}

	@Override
	public synchronized void removeNode(Graph graph, GraphNode targetNode,
			AsyncCallback<Graph> callback) {
		graphBackEnd.removeNode(graph, targetNode, callback);
		
	}

	@Override
	public synchronized void findShortestPath(Graph graph, String fromNode, String toNode,
			AsyncCallback<Graph> graphUpdater) {
		graphBackEnd.findShortestPath(graph, fromNode, toNode, graphUpdater);
		
	}

	@Override
	public synchronized void expandNode(Graph graph, String nodeName,
			AsyncCallback<Graph> graphUpdater) {
		graphBackEnd.expandNode(graph, nodeName, graphUpdater);		
	}

	@Override
	public synchronized void connectNodes(Collection<String> graphNodes, String toNode,
			AsyncCallback<Graph> graphUpdater) {
		graphBackEnd.connectNodes(graphNodes, toNode, graphUpdater);
		
	}

	@Override
	public synchronized void connectNodes(Graph graph, Collection<String> graphNodes,
			String toNode, AsyncCallback<Graph> graphUpdater) {
		graphBackEnd.connectNodes(graph, graphNodes, toNode, graphUpdater);
		
	}

	@Override
	public synchronized void getLiteratureForTags(Graph graph,
			AsyncCallback<Literature> literature) {
		graphBackEnd.getLiteratureForTags(graph, literature);
		
	}

	@Override
	public synchronized void getTagsforLiterature(Literature literature,
			AsyncCallback<Graph> graph) {
		graphBackEnd.getTagsforLiterature(literature, graph);
		
	}

	@Override
	public synchronized void addOrUpdateLiteratureEntry(Literature literatureStored, LiteratureEntry literatureEntry,
			AsyncCallback<Literature> literature) {
		graphBackEnd.addOrUpdateLiteratureEntry(literatureStored, literatureEntry, literature);
		
	}

	@Override
	public synchronized void removeLiteratureEntry(Literature literatureStored, LiteratureEntry literatureEntry,
			AsyncCallback<Literature> lierature) {
		graphBackEnd.removeLiteratureEntry(literatureStored, literatureEntry, lierature);
		
	}

	@Override
	public synchronized void getFullLiterature(AsyncCallback<Literature> literature) {
		graphBackEnd.getFullLiterature(literature);
		
	}

	@Override
	public synchronized void connectLiteratureToGraph(Literature literature, Graph graph,
			AsyncCallback<GraphLiteraturePair> callback) {
		graphBackEnd.connectLiteratureToGraph(literature, graph, callback);
		
	}

}