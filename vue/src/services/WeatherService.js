import axios from "axios";

export default{
    getWeather(zipcode){
        return axios.get(`/weather?zipcode=${zipcode}`);
    }
}